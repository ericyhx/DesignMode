package com.kc.responsibilitychain;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/21
 */
public class HtmlFilter implements Filter {
    @Override
    public String doFilter(String s) {
        s=s.replace("<","【").replace(">","】");
        return s;
    }
}
