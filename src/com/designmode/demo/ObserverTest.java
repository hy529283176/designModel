package com.designmode.demo;

import com.designmode.behaviour.betweenclass.observer.MySubject;
import com.designmode.behaviour.betweenclass.observer.Observer1;
import com.designmode.behaviour.betweenclass.observer.Observer2;
import com.designmode.behaviour.betweenclass.observer.Subject;

import java.util.Collection;
import java.util.LinkedList;

public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
        Collection collection = new LinkedList();
        collection.iterator();
    }

}
