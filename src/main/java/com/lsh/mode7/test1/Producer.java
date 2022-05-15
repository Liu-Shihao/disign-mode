package com.lsh.mode7.test1;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 9:19 下午
 * @desc ：生产者
 */
public class Producer {

    List<Observe> observeList = Arrays.asList(new EventListenerOne(),new EventListenerTwo());

    public void pushMsg(String msg){
        System.out.println("生产者生产消息...");
        //创建事件
        Event event = new Event("1", new Date().toString(), "上海");
        //发布事件
        for (Observe observe : observeList) {
            observe.actionOnSent(event);
        }

    }
}
