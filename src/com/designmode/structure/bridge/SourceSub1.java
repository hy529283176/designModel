package com.designmode.structure.bridge;

/**
 * 桥接模式的实现类
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void methodOne() {
        System.out.println("我是sub1的方法1");
    }
}
