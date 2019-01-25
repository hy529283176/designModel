package com.designmode.structure.bridge;

/**
 * 另一个桥
 */
public class MyBridge extends Bridge {
    public void methodOne(){
        getSourceable().methodOne();
    }
}
