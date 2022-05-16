package com.lsh.mode3.factory;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/14 5:19 下午
 * @desc ：抽象工厂模式
 */
public class Main {
    public static void main(String[] args) {
//        AbstractFactory factory = new BreakfastFactory();
//        AbstractFactory factory = new LunchFactory();
        AbstractFactory factory = new DinnerFactory();
        Drinks drinks = factory.createDrinks();
        Food food = factory.createFood();
        Fruits fruits = factory.createFruits();

    }
}
