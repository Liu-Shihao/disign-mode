package com.lsh.mode6.filterchain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 12:59 上午
 * @desc ：
 */
public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<Filter>();
    int index ;


    //优化
    public FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }
//    public void add(Filter filter){
//        filters.add(filter);
//    }


    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index<filters.size()){
            Filter filter = filters.get(index++);
            filter.doFilter(request,response,filterChain);
        }


    }
}
