package com.lsh.mode7.test2;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 10:04 下午
 * @desc ：观察者模式：彩票开奖
 * 被观察者：lotteryService.lottery();
 * 事件：ResultEvent
 * 观察者（事件监听）：LogEventListener、SMSEventListener
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            LotteryService lotteryService = new LotteryService();
            lotteryService.lottery();
            System.out.println("-------------------");
        }

    }
}
