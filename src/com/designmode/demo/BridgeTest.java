package com.designmode.demo;

import com.designmode.structure.bridge.*;

public class BridgeTest {

    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        Sourceable source1 = new SourceSub1();
        bridge.setSourceable(source1);
        bridge.methodOne();

        /*调用第二个对象*/
        Sourceable source2 = new SourceSub2();
        bridge.setSourceable(source2);
        bridge.methodOne();
    }

}
