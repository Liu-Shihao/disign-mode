package com.lsh.mode6;

import java.util.ArrayList;
import java.util.List;

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

    interface Filter {
        void doFilter(Request request,Response response,FilterChain filterChain);
    }

    static class ContentFilter implements Filter {

        @Override
        public void doFilter(Request request, Response response, FilterChain filterChain) {
            request.str += "ContentFilter-->";
            filterChain.doFilter(request,response,filterChain);
            response.str += "ContentFilter-->";
        }
    }

    static class HtmlFilter implements Filter {
        @Override
        public void doFilter(Request request, Response response, FilterChain filterChain) {
            request.str += "HtmlFilter-->";
//            if (1 == 1) return; 此处可以做逻辑是否向下传递，如果直接返回则不在进行后续Filter过滤
            filterChain.doFilter(request,response,filterChain);
            response.str += "HtmlFilter-->";
        }
    }

    static class FilterChain implements Filter{

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
    static class Request {
        String str;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public Request(String str) {
            this.str = str;
        }

        @Override
        public String toString() {
            return "Response{" +
                    "str='" + str + '\'' +
                    '}';
        }
    }
    static class Response {
        String str;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public Response(String str) {
            this.str = str;
        }

        @Override
        public String toString() {
            return "Response{" +
                    "str='" + str + '\'' +
                    '}';
        }
    }



}
