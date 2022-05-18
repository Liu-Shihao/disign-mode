package com.lsh.mode20.state;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 10:55 下午
 * @desc ：
 */
public class SadState extends PersonState {
    @Override
    public void talk() {
        System.out.println("sad talk");
    }

    @Override
    public void eat() {
        System.out.println("eat less");
    }
}
