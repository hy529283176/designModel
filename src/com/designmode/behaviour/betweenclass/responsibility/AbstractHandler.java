package com.designmode.behaviour.betweenclass.responsibility;

/**
 * 责任链模式
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}
