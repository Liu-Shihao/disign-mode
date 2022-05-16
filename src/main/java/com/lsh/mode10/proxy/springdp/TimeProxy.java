package com.lsh.mode10.proxy.springdp;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/16 11:21 下午
 * @desc ：
 */
public class TimeProxy {

    public void before() {
        System.out.println("method start.." + System.currentTimeMillis());
    }

    public void after() {
        System.out.println("method stop.." + System.currentTimeMillis());
    }

}
