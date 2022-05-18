package com.lsh.mode16.command;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 9:38 下午
 * @desc ：
 */
public abstract class Command {
    public abstract void doit();
    public abstract void undo();
}
