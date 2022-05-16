package com.lsh.mode1.singleton;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 4:56 下午
 * @desc ：静态内部类方式：
 *  在加载Singleton05的时候不会加载静态内部类Singleton05Holder，所以不会提前创建出对象
 *  由JVM保证线程安全
 *
 *  既实现了懒加载又能保证单例
 *
 */
public class Singleton05 {
    //1.构造方法私有化
    private Singleton05(){}
    //静态内部类
    private static class Singleton05Holder{
        //在静态内部类中初始化实例
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    //2.对外提供公开方法
    public static Singleton05 getINSTANCE(){
        return Singleton05Holder.INSTANCE;
    }

    private void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                System.out.println(Singleton05.getINSTANCE().hashCode());
            }).start();

        }
    }


}
