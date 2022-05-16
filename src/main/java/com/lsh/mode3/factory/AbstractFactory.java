package com.lsh.mode3.factory;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/14 5:02 下午
 * @desc ：抽象工厂类
 * 可以制造食物、水果、运动
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Fruits createFruits();
    abstract Drinks createDrinks();
}
