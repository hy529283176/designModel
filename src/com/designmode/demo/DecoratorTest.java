package com.designmode.demo;

import com.designmode.structure.decorator.Decorator;
import com.designmode.structure.decorator.Source;
import com.designmode.structure.decorator.Sourceable;

public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable object = new Decorator(sourceable);
        object.methodOne();
    }
}
