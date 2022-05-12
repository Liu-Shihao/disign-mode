package com.lsh.mode1;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 4:56 下午
 * @desc ：枚举式单例模式
 * 不仅可以解决线程同步，还可以防止反序列化
 * 枚举类没有构造方法
 *
 */
public enum Singleton06 {
    INSTANCE;
    private void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                System.out.println(Singleton06.INSTANCE.hashCode());
            }).start();

        }
    }


}
