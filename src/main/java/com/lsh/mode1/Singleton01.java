package com.lsh.mode1;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 4:56 下午
 * @desc ：饿汉式：类加载到内存中，就实例化一个对象，JVM保证线程安全
 * 简单使用，推荐使用
 * 缺点：空间换时间
 */
public class Singleton01 {
    //初始化实例
    private static final Singleton01  INSTANCE = new Singleton01();

    //1.构造方法私有化
    private Singleton01(){}

    //2.对外提供公开方法
    public static Singleton01 getINSTANCE(){
        return INSTANCE;
    }

    private void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getINSTANCE();
        Singleton01 singleton02 = Singleton01.getINSTANCE();
        System.out.println(singleton01 == singleton02);
    }


}
