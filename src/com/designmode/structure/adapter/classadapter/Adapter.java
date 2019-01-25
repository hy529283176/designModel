package com.designmode.structure.adapter.classadapter;

import com.designmode.structure.adapter.Source;
import com.designmode.structure.adapter.Targetable;

/**
 * 类适配器
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void methodTwo() {
        System.out.println("你好啊，我系方法二喔");
    }

}
