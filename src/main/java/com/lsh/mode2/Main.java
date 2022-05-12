package com.lsh.mode2;

import java.util.Arrays;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 10:01 下午
 * @desc ：
 */
public class Main {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[]{new Dog("4",4),new Dog("44",44),new Dog("2",2)};
        Cat[] cats = new Cat[]{new Cat (1005,5),new Cat(1040,1),new Cat(99,3)};
        Sorter sorter = new Sorter();
        //测试第一种方式：
        Arrays.stream(dogs).forEach(System.out::print);
        System.out.println();
        System.out.println("--------------");

        //测试第二种方式：
        SorterPlus<Cat> catSorterPlus = new SorterPlus<>();
        //自定义不同比较规则
        Comparator<Cat> catComparatorByAge = (t1, t2) -> t1.age - t2.age;
        Comparator<Cat> catComparatorById = (t1, t2) -> t2.id -t1.id;

        catSorterPlus.selectSort(cats,catComparatorByAge);
        System.out.println("--sory by age:");
        Arrays.stream(cats).forEach(System.out::print);


        System.out.println();
        System.out.println("--sort by id");
        catSorterPlus.selectSort(cats,catComparatorById);
        Arrays.stream(cats).forEach(System.out::print);

//        System.out.println();
//        System.out.println("1005".compareTo("1040"));//-4
//        System.out.println("1005".compareTo("99"));//-8
//        System.out.println("1040".compareTo("99"));//-8


    }
}
