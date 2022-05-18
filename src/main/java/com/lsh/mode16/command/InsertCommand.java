package com.lsh.mode16.command;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 9:39 下午
 * @desc ：
 */
public class InsertCommand extends Command {
    Content c;
    String s = "hahah";

    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.msg = c.msg + s;
        System.out.println(c.msg);
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0,c.msg.length() - s.length());
        System.out.println(c.msg);
    }


}
