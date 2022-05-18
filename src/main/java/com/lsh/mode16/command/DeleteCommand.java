package com.lsh.mode16.command;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 9:43 下午
 * @desc ：
 */
public class DeleteCommand extends  Command {

    Content c;
    String deleted;


    public DeleteCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        deleted = c.msg.substring(c.msg.length()-1);
        c.msg = c.msg.substring(0,c.msg.length()-1);
        System.out.println(c.msg);
    }

    @Override
    public void undo() {
        c.msg = c.msg+deleted;
        System.out.println(c.msg);
    }
}
