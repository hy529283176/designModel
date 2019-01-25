package com.designmode.behaviour.classstate.memento;

/**
 * 备忘录模式
 */
public class Storage {

    private Memento memento;

    public Storage() {

    }

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
