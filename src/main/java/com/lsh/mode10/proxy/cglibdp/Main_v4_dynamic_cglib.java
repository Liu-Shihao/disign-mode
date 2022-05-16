package com.lsh.mode10.proxy.cglibdp;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/16 9:08 下午
 * @desc ：代理模式 Proxy
 *
 * CGLIB实现动态代理不需要接口
 */
public class Main_v4_dynamic_cglib {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new MyMethodIntercept());
        Tank tank = (Tank)enhancer.create();
        tank.move();


    }

    static class MyMethodIntercept implements MethodInterceptor{

        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            //o即为生成的代理类，父类是被代理对象，
            // 即cglib动态代理生成的类是被代理对象的子类
            // 但是如果被代理类是final修饰的话，则cglib无法代理
            System.out.println(o.getClass().getSuperclass().getName());
            System.out.println("before");

            Object result = methodProxy.invokeSuper(o, objects);

            System.out.println("after");
            return result;

        }
    }


    static class Tank {

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
