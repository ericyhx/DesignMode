package com.kc.commandpattern;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/6
 */
public class HotCook implements CookApi,Runnable{
    /**
     * 厨师的姓名
     */
    private String name;

    public HotCook(String name) {
        this.name = name;
    }

    @Override
    public void cook(int tableNum, String name) {
        int cookTime= (int) (20*Math.random());
        System.out.println(this.name+" 正在为 "+tableNum+" 号桌做："+name);
        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name+"厨师为"+tableNum+"号桌做好了："+name+",共计耗时="+cookTime+"秒");
    }

    @Override
    public void run() {
        while (true){
            final Command cmd = CommandQueue.getCommand();
            if(cmd!=null){
                cmd.setCookApi(this);
                cmd.execute();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
