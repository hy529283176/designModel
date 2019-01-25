package com.designmode.behaviour.intermediary.mediator;

/**
 * 中间者模式
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();

}
