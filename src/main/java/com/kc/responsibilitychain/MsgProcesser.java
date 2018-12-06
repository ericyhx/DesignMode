package com.kc.responsibilitychain;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/21
 */
public class MsgProcesser {
    private String msg;
    private FilterChain fc=new FilterChain();
    public MsgProcesser(String msg) {
        this.msg = msg;
    }
    public String process(){
//        msg=msg.replace("<","【").replace(">","】");
//        msg=msg.replace("被就业","就业").replace("敏感","*****");
       msg=fc.doFilter(msg);
        return msg;
    }
}
