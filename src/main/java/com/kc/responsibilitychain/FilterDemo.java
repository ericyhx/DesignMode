package com.kc.responsibilitychain;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/21
 */
public class FilterDemo {
    public static void main(String[] args) {
        String str="你好:),<script>,被就业，敏感,你发送的消息";
        FilterChain fc=new FilterChain();
        fc.addFilter(new HtmlFilter())
           .addFilter(new SensitiveFilter());
        str=fc.doFilter(str);
        System.out.println(str);
    }
}
