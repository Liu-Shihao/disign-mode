package com.lsh.mode6.filterchain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 12:57 上午
 * @desc ：
 */
public class Request {
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
