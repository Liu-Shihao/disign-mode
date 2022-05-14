package com.lsh.mode3;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/14 5:06 下午
 * @desc ：早餐工厂类 生产 面包、苹果、豆浆
 */
public class BreakfastFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Fruits createFruits() {
        return new Apple();
    }

    @Override
    Drinks createDrinks() {
        return new SoybeanMilk();
    }

}
