package com.lsh.mode1.singleton;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 4:56 下午
 * @desc ：DCL懒汉式
 * 引申出DCL 双重检查锁
 * 降低锁粒度，提高效率
 * DCL 与 volatile的问题：
 * 防止指令重排
 *
 *
 * synchronized static静态方法锁的是class
 */
public class Singleton04 {
    //最开始不初始化实例
    private static volatile Singleton04 INSTANCE ;

    //1.构造方法私有化
    private Singleton04(){}

    //2.对外提供公开方法
    public static  Singleton04 getINSTANCE(){
        //第一次判断是必要的，可以降低锁资源的争夺
        if (INSTANCE == null){
            //如果实例为空，才进行实例化
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(Singleton04.class){
                //第二次判断，如果实例已经被创建，则不需要重复创建
                if (INSTANCE == null){
                    INSTANCE = new Singleton04();
                }
            }
        }
        return INSTANCE;
    }

    private void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                System.out.println(Singleton04.getINSTANCE().hashCode());
            }).start();

        }
    }


}
