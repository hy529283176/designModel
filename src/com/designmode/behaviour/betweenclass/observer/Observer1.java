package com.designmode.behaviour.betweenclass.observer;

/**
 * 观察者模式
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }

}
