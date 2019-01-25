package com.designmode.behaviour.intermediary.visitor;

/**
 * 访问者模式
 */
public class VisitorImpl implements Visitor {

    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject：" + subject.getSubject());
    }

}
