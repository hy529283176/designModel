package com.designmode.demo;

import java.util.Vector;

import javax.sound.midi.Soundbank;

import com.designmode.create.singleton.normal.NormalSingleton;
import com.designmode.create.singleton.other.ShadowSingleton;
import com.designmode.create.singleton.other.ThreadSafeSingleton;
import com.designmode.create.singleton.simple.SimpleSingleton;

public class SingletonTest {

    public static void main(String[] args) {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        NormalSingleton normalSingleton = NormalSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        ShadowSingleton shadowSingleton = ShadowSingleton.getInstance();
        System.out.println(shadowSingleton);
        Vector vector = shadowSingleton.getProperties();
        shadowSingleton.updateProperties();
        vector = shadowSingleton.getProperties();
        ShadowSingleton shadowSingleton2 = ShadowSingleton.getInstance();
        System.out.println(shadowSingleton2);
        System.out.println(shadowSingleton);
        System.out.println("123");
    }
}
