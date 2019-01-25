package com.designmode.create.singleton.other;

import java.util.Vector;

/**
 * 影子单例模式
 */
public class ShadowSingleton {

    private static ShadowSingleton instance = null;

    private Vector properties = null;
    
    public Vector getProperties() {
        return properties;
    }
    
    private ShadowSingleton() {
        System.out.println("我是影子法的单例模式哦ShadowSingleton");
    }
    
    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new ShadowSingleton();
        }
    }
    
    public static ShadowSingleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
    
    public void updateProperties() {
        ShadowSingleton shadow = new ShadowSingleton();
        System.out.println(shadow);
        properties = shadow.getProperties();
    }
}
