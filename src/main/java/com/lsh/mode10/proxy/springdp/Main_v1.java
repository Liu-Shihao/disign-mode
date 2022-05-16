package com.lsh.mode10.proxy.springdp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/16 11:18 下午
 * @desc ：
 */
public class Main_v1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Tank t = (Tank)context.getBean("tank");
        t.move();
    }
    class TimeProxy {

        public void before() {
            System.out.println("method start.." + System.currentTimeMillis());
        }

        public void after() {
            System.out.println("method stop.." + System.currentTimeMillis());
        }

    }

}
