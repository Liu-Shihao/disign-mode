package com.lsh.mode10.proxy.jdkdp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/16 9:08 下午
 * @desc ：代理模式 Proxy 版本2
 *
 * JDK 动态代理  必须面向接口
 */
public class Main_v3_dynamic_jdk {
    public static void main(String[] args) {

        Tank tank = new Tank();
        //jdk.proxy.ProxyGenerator.saveGeneratedFiles设置为true可以将动态代理生成的类，保存下来,在根目录下会生成一个新的com目录
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");

        //三个参数：ClassLoader、实现的接口class数组、处理方法
        Movable newProxyInstance = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new MyInvocationHandler(tank));
        //调用的是move,但实际调用的是MyInvocationHandler的invoke（）方法
        newProxyInstance.move();

    }

    static class MyInvocationHandler implements InvocationHandler{
        Tank tank;

        public MyInvocationHandler(Tank tank) {
            this.tank = tank;
        }

        public long before(Method method){
            System.out.println("method:"+method.getName()+" start...");
            return System.currentTimeMillis();
        }

        public void after(Method method,long start ){
            long end = System.currentTimeMillis();
            System.out.println(end-start);
            System.out.println("method:"+method.getName()+" end...");
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            long before = before(method);

            Object invoke = method.invoke(tank, args);

            after(method,before);

            return invoke;
        }
    }


    interface Movable {

        void move();
    }

    static class Tank implements Movable {

        @Override
        public void move() {
            System.out.println("Tank move ....");
            try {
                Thread.sleep(new Random().nextInt(10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
