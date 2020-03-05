package com.kc.proto;

import org.reflections.Reflections;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2020/3/5
 */
public class ProtoUtils {
    public static void main(String[] args) throws Exception {
        String root = System.getProperty("user.dir");
        String protoPath=root.concat(File.separator).concat("rcs-proto-util/src/main/proto/");
        Reflections reflections=new Reflections("com.kc.evo.rcs.brain");
        Set subType = reflections.getSubTypesOf(Param.class);
        System.out.println(subType.size());
        generatorProto(protoPath, subType);
        String dir=root.concat(File.separator).concat("rcs-proto-util/src/main");
        runBatScript(dir);

    }

    private static void runBatScript(String dir) {
        StringBuilder sb=new StringBuilder();
        sb.append("echo off & color 0A\n");
        sb.append("set DIR=").append(dir).append("/proto\n");
        sb.append("set TOOL=").append(dir).append("/proto/protoc3.6.1.exe\n");
        sb.append("set TAR=").append(dir).append("/java/\n");
        sb.append("echo DIR=%DIR%\n");
        sb.append("echo TOOL=%TOOL%\n");
        sb.append("echo TAR=%TAR%\n\n");
        sb.append("for /R %DIR% %%f in (*.proto) do (\n\n");
        sb.append("%TOOL% -I=%DIR% --java_out=%TAR% %%f\n");
        sb.append("echo %%f successful!\n");
        sb.append(")");

        try {
            String batPath=dir+"/proto/proto.bat";
            BufferedWriter writer=new BufferedWriter(new FileWriter(batPath));
            writer.write(sb.toString());
            writer.flush();
            writer.close();
            Process child = Runtime.getRuntime().exec(dir+"/proto/proto.bat");
            InputStream in = child.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(in));
            String line;
            while((line=bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }
            in.close();
            System.out.println("proto Cmd execute finished");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generatorProto(String protoPath, Set<Class<?>> clzs) throws Exception {
        for (Class<?> clz : clzs) {
            if(Modifier.isAbstract(clz.getModifiers())){
                continue;
            }
            Path pbPath = Paths.get(protoPath+clz.getSimpleName()+".proto");
            if(!Files.exists(pbPath)){
                pbPath=Files.createFile(pbPath);
            }
            try(BufferedWriter writer = Files.newBufferedWriter(pbPath)){
                int n=0;
                String messageName="Pb"+clz.getSimpleName();
                StringBuilder sb = framework(messageName,clz.getPackage().getName()+".pbmessage");
                sb=traversalField(0,clz,sb,0);
                sb.append("// [结束 消息定义]\n");
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static StringBuilder traversalField(int n,Class clz,StringBuilder sb,int blankNum) throws Exception {
        if(clz.isEnum()){
            addBlank(sb,blankNum);
            sb.append("enmu "+clz.getSimpleName()+"{\n");
            Object[] enums = clz.getEnumConstants();
            int index=0;
            for (Object em : enums) {
                addBlank(sb,blankNum+2);
                sb.append(em).append(" = ").append(index++).append(";\n");
            }
            addBlank(sb,blankNum);
            sb.append("}\n");
            return sb;
        }
        addBlank(sb,blankNum);
        sb.append("message "+clz.getSimpleName()+" {\n");
        for (Field f : clz.getDeclaredFields()) {
            if(f.getType()==Logger.class||f.getType()==PointNode.class){
                continue;
            }
            n++;
            String type = convert(f.getType().getTypeName());
            if(type==null){
                type=f.getType().getSimpleName();
                traversalField(0,f.getType(),sb,blankNum+2);
            }
            addBlank(sb,blankNum+2);
            sb.append(type+" "+f.getName()+" = "+n+";\n");
        }
        Class superClz=clz.getSuperclass();
        while (superClz!=null){
            Field[] fs = superClz.getDeclaredFields();
            for (Field f : fs) {
                if(f.getType()==Logger.class||f.getType()==PointNode.class){
                    continue;
                }
                n++;
                String type = convert(f.getType().getTypeName());
                if(f.getType()==List.class||f.getType()==Set.class){
                    type="repeated int32";
                }
                if(type==null){
                    type=f.getType().getSimpleName();
                    traversalField(0,f.getType(),sb,blankNum+2);
                }
                addBlank(sb,blankNum+2);
                sb.append(type+" "+f.getName()+" = "+n+";\n");
            }
            superClz=superClz.getSuperclass();
        }
        addBlank(sb,blankNum);
        sb.append("}\n");
        return sb;
    }
    private static void addBlank(StringBuilder sb,int num){
        for (int i = 0; i < num; i++) {
            sb.append(" ");
        }
    }
    private static String convert(String typeName){
        String result=null;
        switch (typeName){
            case "int":
            case "java.lang.Integer":
            case "short":
            case "java.lang.Short":
                result="int32";
                break;
            case "byte":
            case "java.lang.Byte":
                result="bytes";
                break;
            case "long":
            case "java.lang.Long":
                result="int64";
                break;
            case "float":
            case "java.lang.Float":
                result="float";
                break;
            case "double":
            case "java.lang.Double":
                result="double";
                break;
            case "boolean":
            case "java.lang.Boolean":
                result="bool";
                break;
            case "java.lang.String":
                result="string";
                break;
        }
        if(result==null){
//            throw new IllegalArgumentException("没有找到匹配的类型");
        }
        return result;
    }
    private static StringBuilder framework(String messageName,String outPackage){
        StringBuilder sb=new StringBuilder();
        sb.append("// [开始声明]\n");
        sb.append("syntax = \"proto3\";\n");
        sb.append("//定义protobuf的包名称空间\n");
        sb.append("package message;\n");
        sb.append("// [结束声明]\n");
        sb.append("// [开始 java 选项配置]\n");
        sb.append("option java_package = \""+outPackage+"\";\n");
        sb.append("option java_outer_classname = \""+messageName+"\";\n");
        sb.append("// [结束 java 选项配置]\n");
        sb.append("// [开始 消息定义]\n");
        return sb;
    }
}
