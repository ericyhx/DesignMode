package com.kc.responsibilitychain.webFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/21
 */
public class FilterChain implements Filter{
    private List<Filter> fs=new ArrayList<>();
    private int index=0;
    public FilterChain addFilter(Filter filter){
        fs.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response,FilterChain fc) {
        if(index==fs.size())return;
        Filter filter = fs.get(index);
        index++;
        filter.doFilter(request,response,fc);
    }
}
