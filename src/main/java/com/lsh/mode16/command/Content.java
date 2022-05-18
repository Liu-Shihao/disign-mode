package com.lsh.mode16.command;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 9:40 下午
 * @desc ：
 */
public class Content {

    public String  msg;

    public Content(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Content{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
