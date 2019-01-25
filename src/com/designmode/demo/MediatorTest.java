package com.designmode.demo;

import com.designmode.behaviour.intermediary.mediator.Mediator;
import com.designmode.behaviour.intermediary.mediator.MediatorImpl;

public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        mediator.createMediator();
        mediator.workAll();
    }

}
