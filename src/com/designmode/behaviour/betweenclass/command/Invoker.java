package com.designmode.behaviour.betweenclass.command;

/**
 * 命令模式
 */
public class Invoker {

    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }

}
