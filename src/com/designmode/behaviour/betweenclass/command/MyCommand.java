package com.designmode.behaviour.betweenclass.command;

/**
 * 命令模式
 */
public class MyCommand implements ICommand {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }

}
