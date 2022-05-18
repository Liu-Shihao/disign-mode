package com.lsh.mode20.state;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 10:53 下午
 * @desc ：
 */
public class Person {
    public String name;
    public PersonState state;


    public void talk(){
        state.talk();
    }

    public void eat(){
        state.eat();

    }

    public Person(String name, PersonState state) {
        this.name = name;
        this.state = state;
    }
}
