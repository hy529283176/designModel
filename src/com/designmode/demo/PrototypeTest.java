package com.designmode.demo;

import java.io.IOException;

import com.designmode.create.prototype.normal.NormalPrototype;
import com.designmode.create.prototype.simple.SimplePrototype;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
        SimplePrototype simplePrototype = new SimplePrototype();
        SimplePrototype simplePrototype2 = (SimplePrototype) simplePrototype.clone();
        simplePrototype.method();
        simplePrototype2.method();
        System.out.println(simplePrototype);
        System.out.println(simplePrototype2);
        NormalPrototype normalPrototype = new NormalPrototype();
        normalPrototype.setString("str");
        NormalPrototype normalPrototype2 = (NormalPrototype) normalPrototype.clone();
        NormalPrototype normalPrototype3 = (NormalPrototype) normalPrototype.deepClone();
        System.out.println(normalPrototype.getString());
        System.out.println(normalPrototype2.getString());
        System.out.println(normalPrototype3.getString());
        System.out.println(normalPrototype);
        System.out.println(normalPrototype2);
        System.out.println(normalPrototype3);
    }

}
