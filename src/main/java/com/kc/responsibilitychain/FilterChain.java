package com.kc.responsibilitychain;

import java.io.PipedReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/21
 */
public class FilterChain {
//    private Filter[] fs={new HtmlFilter(),new SensitiveFilter()};
    private List<Filter> fs=new ArrayList<>();
    public FilterChain addFilter(Filter filter){
        fs.add(filter);
        return this;
    }
    public String doFilter(String s){
        for(Filter f:fs){
            s=f.doFilter(s);
        }
        return s;
    }
}
