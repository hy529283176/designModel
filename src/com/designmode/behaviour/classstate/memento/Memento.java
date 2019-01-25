package com.designmode.behaviour.classstate.memento;

/**
 * 备忘录模式
 */
public class Memento {

    private String value;

    public Memento() {
    }

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
