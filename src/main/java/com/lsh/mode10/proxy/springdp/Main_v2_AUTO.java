package com.lsh.mode10.proxy.springdp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/16 11:18 下午
 * @desc ：
 */
public class Main_v2_AUTO {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app_auto.xml");
        Tank t = (Tank)context.getBean("tank");
        t.move();
    }


    @Aspect
    class TimeProxy {

        @Before("execution (void com.lsh.mode10.proxy.springdp.Tank.move())")
        public void before() {
            System.out.println("method start.." + System.currentTimeMillis());
        }

        @After("execution (void com.lsh.mode10.proxy.springdp.Tank.move())")
        public void after() {
            System.out.println("method stop.." + System.currentTimeMillis());
        }

    }

}
