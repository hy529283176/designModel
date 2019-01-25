package com.designmode.create.singleton.normal;

/**
 * 比较完美的单例模式，避免多线程问题
 * @author Southgis_Puppy
 *
 */
public class NormalSingleton {

    /* 私有构造方法，防止被实例化 */
    private NormalSingleton() {
        System.out.println("我是单例模式的一般方法哦NormalSingleton");
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingleTonFactory {

        private static NormalSingleton instance = new NormalSingleton();
    }

    /* 获取实例 */
    public static NormalSingleton getInstance() {
        return SingleTonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

}
