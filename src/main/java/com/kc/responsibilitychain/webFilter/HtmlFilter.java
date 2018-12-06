package com.kc.responsibilitychain.webFilter;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/21
 */
public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response,FilterChain fc) {
        request.requstStr=request.requstStr.replace("<","【").replace(">","】");
        fc.doFilter(request,response,fc);
        response.responseStr+="----->HtmlFilter";
    }
}
