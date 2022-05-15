package com.lsh.mode7.test1;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 8:58 下午
 * @desc ：事件处理模型 观察者模式
 */
public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.pushMsg("xxxx,消息时间：2022-05-15 21:24:34");

    }
}
