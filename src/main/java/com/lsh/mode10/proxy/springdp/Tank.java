package com.lsh.mode10.proxy.springdp;

import java.util.Random;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/16 11:20 下午
 * @desc ：
 */
public class Tank {

    /**
     * 模拟坦克移动了一段儿时间
     */
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
