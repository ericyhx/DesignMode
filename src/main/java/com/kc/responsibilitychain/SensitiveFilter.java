package com.kc.responsibilitychain;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/21
 */
public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String s) {
        s=s.replace("被就业","就业").replace("敏感","*****");
        return s;
    }
}
