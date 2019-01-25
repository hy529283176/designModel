package com.designmode.structure.bridge;

/**
 * 桥接模式的桥
 */
public abstract class Bridge {

    private Sourceable sourceable;

    public void methodOne() {
        sourceable.methodOne();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
}
