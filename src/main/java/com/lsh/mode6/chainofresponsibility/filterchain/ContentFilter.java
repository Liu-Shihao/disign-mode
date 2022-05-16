package com.lsh.mode6.chainofresponsibility.filterchain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 12:58 上午
 * @desc ：
 */
public class ContentFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.str += "ContentFilter-->";
        filterChain.doFilter(request,response);
        response.str += "ContentFilter-->";
    }
}
