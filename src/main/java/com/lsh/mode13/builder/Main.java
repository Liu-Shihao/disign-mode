package com.lsh.mode13.builder;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/17 10:52 下午
 * @desc ：Builder 建造者模式 构建复杂对象
 * 可以使用有参构造，但是使用builder模式会更加灵活
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .baseInfo("zhangsan", 20)
//                .gender("man") //可以随时去掉
                .tel("11213121")
                .address("140-401", "二仙桥")
                .build();
        System.out.println(person);
    }

}
