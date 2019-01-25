package com.designmode.create.prototype.simple;

/**
 * 简单的原型模式
 * @author Southgis_Puppy
 *
 */
public class SimplePrototype implements Cloneable {

    public SimplePrototype() {
        System.out.println("I am simple prototype model");
    }
    
    public Object clone() throws CloneNotSupportedException {
        SimplePrototype prototype = (SimplePrototype) super.clone();
        return prototype;
    }
    
    public void method() {
        System.out.println("i am method one");
    }
}
