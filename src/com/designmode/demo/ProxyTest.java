package com.designmode.demo;

import com.designmode.structure.proxy.ProxyClazz;
import com.designmode.structure.proxy.Proxyable;


public class ProxyTest {

    public static void main(String[] args) {
        Proxyable source = new ProxyClazz();
        source.methodOne();
    }

}
