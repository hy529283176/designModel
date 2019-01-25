package com.designmode.behaviour.fatherson.strategy;

/**
 * 策略模式的功能类
 */
public class Minus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\-");
        return arrayInt[0] - arrayInt[1];
    }

}
