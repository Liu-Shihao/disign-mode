package com.lsh.mode7.test2;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 10:03 下午
 * @desc ：日志事件监听
 */
public class LogEventListener implements EventListener{
    @Override
    public void doEvent(ResultEvent result) {
        if (result.getSource() instanceof LotteryService){
            System.out.println("记录日志事件：彩排开奖结果："+result.getResult()+","+result.getTime());

        }
    }
}
