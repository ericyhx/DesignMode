package com.kc.responsibilitychain.webFilter;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/21
 */
public class WebDemo {
    public static void main(String[] args) {
        String str="你好:),<script>,被就业，敏感,你发送的消息";
        Request request=new Request();
        request.setRequstStr(str);
        Response response=new Response();
        response.setResponseStr("response:");
        FilterChain fc=new FilterChain();
        fc.addFilter(new HtmlFilter())
            .addFilter(new SensitiveFilter());
        fc.doFilter(request,response,fc);
        System.out.println(request.requstStr);
        System.out.println(response.responseStr);

    }
}
