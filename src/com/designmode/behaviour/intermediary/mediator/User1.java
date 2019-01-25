package com.designmode.behaviour.intermediary.mediator;

/**
 * 中间者模式
 */
public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }

}