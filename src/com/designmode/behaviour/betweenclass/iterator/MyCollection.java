package com.designmode.behaviour.betweenclass.iterator;

/**
 * 迭代子模式
 *
 * @param <E>
 */
public class MyCollection<E> implements Collection<E> {

    public Object[] collection;

    private int length = 0;

    public MyCollection() {
        collection = new Object[length];
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return collection[i];
    }

    @Override
    public int size() {
        return collection.length;
    }

    @Override
    public void add(Object object) {
        length++;
        if (length == 1) {
            collection = new Object[length];
            collection[length - 1] = object;
        } else {
            collection = java.util.Arrays.copyOf(collection, length);
            collection[length - 1] = object;
        }

    }

}
