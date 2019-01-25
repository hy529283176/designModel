package com.designmode.behaviour.intermediary.visitor;

/**
 * 访问者模式
 */
public class SubjectImpl implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "i just a stupid man";
    }

}
