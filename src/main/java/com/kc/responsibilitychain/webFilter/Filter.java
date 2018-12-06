package com.kc.responsibilitychain.webFilter;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/21
 */
public interface Filter {
    void doFilter(Request request,Response response,FilterChain filterChain);
}
