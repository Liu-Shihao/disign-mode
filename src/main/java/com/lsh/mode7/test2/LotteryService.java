package com.lsh.mode7.test2;

import java.util.*;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 10:10 下午
 * @desc ：彩票
 */
public class LotteryService {

    List<EventListener> listeners = Arrays.asList(new SMSEventListener(),new LogEventListener());

    public void lottery(){
        System.out.println("彩票开奖啦！");
        ResultEvent resultEvent = new ResultEvent();
        resultEvent.setTime(new Date().toString());
        resultEvent.setSource(this);
        if (new Random().nextInt(10) < 5){
            resultEvent.setResult("中奖");
        }else {
            resultEvent.setResult("很遗憾，未中奖！");
        }
        for (EventListener listener : listeners) {
            listener.doEvent(resultEvent);
        }

    }
}
