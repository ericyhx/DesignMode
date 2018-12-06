package com.kc.bridge;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/27
 */
public class Boy {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void pursue(MM mm){
        Gift g=new WarmGift(new Flower());
        Gift g1=new WarmGift(new Ring());
        give(g,mm);
    }

    private void give(Gift gift,MM mm) {


    }
}
