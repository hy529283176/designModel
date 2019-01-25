package com.designmode.demo;

import com.designmode.behaviour.betweenclass.iterator.Collection;
import com.designmode.behaviour.betweenclass.iterator.Iterator;
import com.designmode.behaviour.betweenclass.iterator.MyCollection;

public class InteratorTest {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
