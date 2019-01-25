package com.designmode.demo;

import com.designmode.behaviour.intermediary.visitor.Subject;
import com.designmode.behaviour.intermediary.visitor.SubjectImpl;
import com.designmode.behaviour.intermediary.visitor.Visitor;
import com.designmode.behaviour.intermediary.visitor.VisitorImpl;

public class VisitorTest {

    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();
        Subject sub = new SubjectImpl();
        sub.accept(visitor);
    }

}
