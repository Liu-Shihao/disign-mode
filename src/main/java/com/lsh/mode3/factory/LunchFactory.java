package com.lsh.mode3.factory;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/14 5:08 下午
 * @desc ：午餐工厂类 生产 米饭 、西瓜、可乐
 */
public class LunchFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new Rice();
    }

    @Override
    Fruits createFruits() {
        return new Watermelon();
    }

    @Override
    Drinks createDrinks() {
        return new Coke();
    }
}
