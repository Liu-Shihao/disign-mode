package com.lsh.mode6.chainofresponsibility.filterchain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 12:58 上午
 * @desc ：
 */
public class HtmlFilter  implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.str += "HtmlFilter-->";
//            if (1 == 1) return; 此处可以做逻辑是否向下传递，如果直接返回则不在进行后续Filter过滤
        filterChain.doFilter(request,response);
        response.str += "HtmlFilter-->";
    }
}
