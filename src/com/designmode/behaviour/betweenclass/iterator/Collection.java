package com.designmode.behaviour.betweenclass.iterator;

/**
 * 迭代子模式
 *
 * @param <E>
 */
public interface Collection<E> {

    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();

    public void add(Object object);

}
