package com.lsh.mode7.test1;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 9:11 下午
 * @desc ：定义观察者接口：所有的具体观察者实现类实现此接口
 */
public interface Observe {
    void actionOnSent(Event event);
}
