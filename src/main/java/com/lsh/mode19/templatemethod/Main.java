package com.lsh.mode19.templatemethod;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 10:37 下午
 * @desc ：模板方法
 */
public class Main {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.m();

    }

}

//定义抽象类 ，定义抽象方法op1 op2 ，没有具体实现，通过子类实现
abstract class F{
    public void m(){
        op1();
        op2();
    }

    abstract void op1();
    abstract void op2();
}

class C1 extends F{

    @Override
    void op1() {
        System.out.println("op1");
    }

    @Override
    void op2() {
        System.out.println("op2");
    }
}
