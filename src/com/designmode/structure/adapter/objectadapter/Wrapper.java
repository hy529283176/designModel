package com.designmode.structure.adapter.objectadapter;

import com.designmode.structure.adapter.Source;
import com.designmode.structure.adapter.Targetable;

/**
 * 对象适配器
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void methodOne() {
        source.methodOne();
    }

    @Override
    public void methodTwo() {
        System.out.println("我是方法2");
    }

}
