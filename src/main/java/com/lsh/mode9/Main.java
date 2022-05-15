package com.lsh.mode9;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 10:42 下午
 * @desc ：Java 中的享元模式：String
 */
public class Main {

    public static void main(String[] args) {
        String a = "123";
        String b = "123";
        String c = new String("123");
        String d = new String("123");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);
        System.out.println(a == c.intern());//.intern() 堆中的常量池引用
        System.out.println(c.intern() == d.intern());

    }

}
