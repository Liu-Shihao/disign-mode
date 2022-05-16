package com.lsh.mode6.chainofresponsibility.filterchain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 12:58 上午
 * @desc ：
 */
public class Response {
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
