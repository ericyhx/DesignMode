package com.kc.responsibilitychain.webFilter;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/21
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response,FilterChain fc) {
        request.requstStr=request.requstStr.replace("被就业","就业").replace("敏感","*****");
        fc.doFilter(request,response,fc);
        response.responseStr+="----->SensitiveFilter";

    }
}
