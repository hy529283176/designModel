package com.designmode.behaviour.betweenclass.observer;

/**
 * 观察者模式
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }

}
