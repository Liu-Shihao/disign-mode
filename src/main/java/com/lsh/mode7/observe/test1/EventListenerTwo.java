package com.lsh.mode7.observe.test1;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 9:15 下午
 * @desc ：观察者：事件监听者1
 */
public class EventListenerTwo implements Observe {

    @Override
    public void actionOnSent(Event event) {
        System.out.println("二号监听者正在消费...");
    }
}
