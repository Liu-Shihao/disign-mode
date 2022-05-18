package com.lsh.mode16.command;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/18 9:37 下午
 * @desc ：
 */
public class Main {

    public static void main(String[] args) {
        InsertCommand insertCommand = new InsertCommand(new Content("HelloWorld"));
        insertCommand.doit();
        insertCommand.undo();

        DeleteCommand deleteCommand = new DeleteCommand(new Content("123456"));
        deleteCommand.doit();
        deleteCommand.undo();

    }
}
