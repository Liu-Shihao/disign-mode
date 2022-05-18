package com.lsh.mode20.state;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 10:49 下午
 * @desc ：state 状态模式 根据不同的状态作出不同的行为
 * 将状态抽象出来
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("zhangsan",new HappyState());
        person.eat();
        person.talk();
        person.state = new SadState();
        person.eat();
        person.talk();

    }
}
