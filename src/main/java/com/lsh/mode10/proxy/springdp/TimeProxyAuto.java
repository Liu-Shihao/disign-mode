package com.lsh.mode10.proxy.springdp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/16 11:21 下午
 * @desc ：
 */
@Aspect
public class TimeProxyAuto {

    @Before("execution (void com.lsh.mode10.proxy.springdp.Tank.move())")
    public void before() {
        System.out.println("method start.." + System.currentTimeMillis());
    }

    @After("execution (void com.lsh.mode10.proxy.springdp.Tank.move())")
    public void after() {
        System.out.println("method stop.." + System.currentTimeMillis());
    }

}
