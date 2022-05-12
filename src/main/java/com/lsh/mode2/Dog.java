package com.lsh.mode2;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 10:01 下午
 * @desc ：
 */
public class Dog implements Comparable<Dog> {
    String name;
    int weight;

    @Override
    public int compareTo(Dog dog) {
        return weight - dog.weight;
    }

    public Dog() {
    }

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
