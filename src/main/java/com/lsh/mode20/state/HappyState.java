package com.lsh.mode20.state;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 10:54 下午
 * @desc ：
 */
public class HappyState extends PersonState {
    @Override
    public void talk() {
        System.out.println("happy talk");
    }

    @Override
    public void eat() {
        System.out.println("eat more");

    }
}
