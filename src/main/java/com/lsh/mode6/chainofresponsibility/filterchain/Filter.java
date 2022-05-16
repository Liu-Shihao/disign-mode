package com.lsh.mode6.chainofresponsibility.filterchain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 12:57 上午
 * @desc ：
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);

}
