package com.designmode.behaviour.fatherson.template;

/**
 * 模板方法模式
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculte(int num1, int num2) {
        return num1 + num2;
    }

}
