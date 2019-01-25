package com.designmode.create.singleton.other;

/**
 * 线程保护单例模式
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
        System.out.println("我是其他单例模式哦，线程保护我ThreadSafeSingleton");
    }
    
    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
    }
    
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
