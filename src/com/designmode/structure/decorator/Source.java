package com.designmode.structure.decorator;

/**
 * 被装饰类
 */
public class Source implements Sourceable{
    @Override
    public void methodOne() {
        System.out.println("i am a pretty boy");
    }
}
