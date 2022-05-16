package com.lsh.mode3.factory;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/14 5:06 下午
 * @desc ：晚餐工厂类 生产面条、香蕉和纯净水
 */
public class DinnerFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Noodles();
    }

    @Override
    Fruits createFruits() {
        return new Banana();
    }

    @Override
    Drinks createDrinks() {
        return new Water();
    }

}
