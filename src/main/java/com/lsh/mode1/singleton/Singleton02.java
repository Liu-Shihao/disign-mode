package com.lsh.mode1.singleton;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 4:56 下午
 * @desc ：懒汉式：按需初始化，只有在用的时候才进行初始化
 * 此种写法存在问题：不能保证单例
 *
 * 缺点：时间换空间，多线程时无法保证单例：在第一个线程创建实例对象还未完成时，此时INSTANCE仍为空，导致其他线程也创建了一个对象
 */
public class Singleton02 {
    //最开始不初始化实例
    private static Singleton02 INSTANCE ;

    //1.构造方法私有化
    private Singleton02(){}

    //2.对外提供公开方法
    public static Singleton02 getINSTANCE(){
        if (INSTANCE == null){
            //如果实例为空，才进行实例化
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }

    private void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                System.out.println(Singleton02.getINSTANCE().hashCode());
            }).start();

        }
    }


}
