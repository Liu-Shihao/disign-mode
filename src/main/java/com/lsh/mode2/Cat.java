package com.lsh.mode2;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 10:01 下午
 * @desc ：
 */
public class Cat implements Comparable<Cat> {

    int id;
    int age;


    @Override
    public int compareTo(Cat c) {
        return age - c.age;
    }

    public Cat(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "ID='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
