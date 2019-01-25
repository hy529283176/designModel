package com.designmode.structure.decorator;

/**
 * 装饰类
 */
public class Decorator implements Sourceable {

    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void methodOne() {
        System.out.println("加强前");
        sourceable.methodOne();
        System.out.println("加强后");
    }
}
