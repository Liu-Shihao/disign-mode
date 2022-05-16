package com.lsh.mode7.observe.test2;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 10:03 下午
 * @desc ：短信事件监听
 */
public class SMSEventListener implements EventListener {
    @Override
    public void doEvent(ResultEvent result) {
        if (result.getSource() instanceof LotteryService){
            if (result.getResult().equals("中奖")){
                System.out.println("短信事件监听：中奖了，发送短息通知。");
            }else {
                System.out.println("短信事件监听：未中奖，不发短信。");
            }
        }

    }
}
