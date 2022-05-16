package com.lsh.mode10.proxy.staticdp;

import java.util.Random;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/16 9:08 下午
 * @desc ：代理模式 Proxy
 * 想要记录坦克移动的时间怎么办？
 * 1.直接在方法先后记录时间
 * 2.创建代理类TankTimeProxy
 *
 * 静态代理
 *
 */
public class Main_v1 {
    public static void main(String[] args) {
        TankTimeProxy tankTimeProxy = new TankTimeProxy(new Tank());
        tankTimeProxy.move();
        //只能代理一个坦克，不能组合
        TankLogProxy tankLogProxy = new TankLogProxy(new Tank());
        tankLogProxy.move();
    }


    interface Movable {

        void move();
    }

    static class Tank implements Movable {

        @Override
        public void move() {
            System.out.println("Tank move ....");
            try {
                Thread.sleep(new Random().nextInt(10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    /**
     * 代理类1
     */
    static class TankTimeProxy implements Movable {
        Tank tank ;

        public TankTimeProxy(Tank tank) {
            this.tank = tank;
        }

        @Override
        public void move() {
            long start = System.currentTimeMillis();
            tank.move();
            long end = System.currentTimeMillis();
            System.out.println("坦克移动了："+(end-start));
        }
    }

    /**
     * 代理类2
     */
    static class TankLogProxy implements Movable {
        Tank tank ;

        public TankLogProxy(Tank tank) {
            this.tank = tank;
        }

        @Override
        public void move() {
            System.out.println("坦克开始移动。。");
            tank.move();
            System.out.println("坦克停止移动");
        }
    }


}
