package com.lsh.mode6.filterchain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/14 11:34 下午
 * @desc ：责任链模式
 *
 * 以Filter为例
 * request  -->  f1  f2
 *                    |
 * response <--  f1  f2
 * 经过filer的顺序为： 请求 f1 f2 f2 f1 返回
 */
public class FilterChainMain {

    public static void main(String[] args) {
        Request request = new Request("request:");
        Response response = new Response("response:");

        FilterChain filterChain = new FilterChain();
//        filterChain.add(new HtmlFilter());
//        filterChain.add(new ContentFilter());
        //优化   链式编程
        filterChain.add(new HtmlFilter()).add(new ContentFilter());

        filterChain.doFilter(request,response,filterChain);

        System.out.println(request);
        System.out.println(response);
    }

}
