package com.lsh.mode10.proxy.staticdp;

import java.util.Random;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/16 9:08 下午
 * @desc ：代理模式 Proxy 版本2
 *
 * 静态代理
 */
public class Main_v2 {
    public static void main(String[] args) {

        TankTimeProxy tankTimeProxy =
                new TankTimeProxy(
                        new TankLogProxy(
                                new Tank()));
        tankTimeProxy.move();

    }


    interface Movable {

        void move();
    }

    static class Tank implements Movable {

        @Override
        public void move() {
            System.out.println("Tank move ....");
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    /**
     * 代理类1
     */
    static class TankTimeProxy implements Movable {
        Movable movable ;

        public TankTimeProxy(Movable movable) {
            this.movable = movable;
        }

        @Override
        public void move() {
            long start = System.currentTimeMillis();
            movable.move();
            long end = System.currentTimeMillis();
            System.out.println("坦克移动了："+(end-start));
        }
    }

    /**
     * 代理类2
     */
    static class TankLogProxy implements Movable {
        Movable movable ;

        public TankLogProxy(Movable movable) {
            this.movable = movable;
        }

        @Override
        public void move() {
            System.out.println("坦克开始移动。。");
            movable.move();
            System.out.println("坦克停止移动");
        }
    }


}
