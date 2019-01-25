package com.designmode.structure.proxy;

public class Source implements Proxyable {
    @Override
    public void methodOne() {
        System.out.println("the original method!");
    }
}
