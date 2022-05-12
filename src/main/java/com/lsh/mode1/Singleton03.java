package com.lsh.mode1;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 4:56 下午
 * @desc ：懒汉式：按需初始化，只有在用的时候才进行初始化
 *
 * 此种写法存在问题：效率很低
 *
 * 缺点：时间换空间，多线程时无法保证单例：在第一个线程创建实例对象还未完成时，此时INSTANCE仍为空，导致其他线程也创建了一个对象
 * 可以通过 synchronized 加锁解决多多线程问题，但是效率会降低
 * 注意：如果 锁加在if判空之后，则等于没有加锁，同样会导致非单例问题：因为多个线程都进入了if判断，只是在等在获取锁资源，获得锁之后同样还是会创建出对象
 * 引申出DCL 双重检查锁
 */
public class Singleton03 {
    //最开始不初始化实例
    private static Singleton03 INSTANCE ;

    //1.构造方法私有化
    private Singleton03(){}

    //2.对外提供公开方法
    public static synchronized Singleton03 getINSTANCE(){
        if (INSTANCE == null){
            //如果实例为空，才进行实例化
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    private void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                System.out.println(Singleton03.getINSTANCE().hashCode());
            }).start();

        }
    }


}
