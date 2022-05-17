package com.lsh.mode11.iterator;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/17 9:40 下午
 * @desc ：
 */
public interface MyCollection {
    int size();

    void add(Object t);

    MyIterator iterator();
}
