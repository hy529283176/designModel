package com.designmode.demo;

import com.designmode.behaviour.betweenclass.command.ICommand;
import com.designmode.behaviour.betweenclass.command.Invoker;
import com.designmode.behaviour.betweenclass.command.MyCommand;
import com.designmode.behaviour.betweenclass.command.Receiver;

public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ICommand cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();

    }

}
