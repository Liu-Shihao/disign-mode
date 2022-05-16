package com.lsh.mode6.chainofresponsibility.filterchain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/14 11:34 下午
 * @desc ：责任链模式
 * 过滤器Filter实现了javax.servlet.Filter接口也就是说过滤器的使用要依赖于Tomcat等容器，所以它只能在web程序中使用。
 * 拦截器Interceptor实现了org.springframework.web.servlet接口，它是由Spring容器进行管理，并不依赖Tomcat等容器，既可以应用在web程序中，也可以应用在非web程序中。
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

        filterChain.doFilter(request,response);

        System.out.println(request);
        System.out.println(response);
    }

}
