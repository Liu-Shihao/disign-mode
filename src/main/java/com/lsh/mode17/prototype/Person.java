package com.lsh.mode17.prototype;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 9:58 下午
 * @desc ：Cloneable是一个标记性接口，里面没有任何方法，
 * 注意：要使用clone（）方法，必须做到一下两点
 * 1.必须实现Cloneable接口（虽然Cloneable接口里没有任何方法，不实现接口编译不报错但是在运行的时候会抛出CloneNotSupportedException异常）
 * 2.重写clone()方法，因为在Object类中，此方法是受保护的 protected
 *
 *
 */
public class Person implements Cloneable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 重写clone方法
     * 因为在Object类中，此方法是受保护的 protected
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
