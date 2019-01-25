package com.designmode.behaviour.intermediary.visitor;

/**
 * 访问者模式
 */
public interface Subject {

    void accept(Visitor visitor);

    String getSubject();

}
