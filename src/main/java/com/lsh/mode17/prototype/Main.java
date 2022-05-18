package com.lsh.mode17.prototype;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 9:58 下午
 * @desc ：
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("zs", 21);
//        Person clone = (Person)person.clone();
        Object clone = person.clone();
        System.out.println(person);
        System.out.println(clone);
        System.out.println(person == clone);


    }
}
