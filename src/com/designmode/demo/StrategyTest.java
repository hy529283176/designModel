package com.designmode.demo;

import com.designmode.behaviour.fatherson.strategy.ICalculator;
import com.designmode.behaviour.fatherson.strategy.Plus;
import com.designmode.behaviour.fatherson.template.AbstractCalculator;

public class StrategyTest {

    public static void main(String[] args) {
        String str = "2+8";
        ICalculator calculator = new Plus();
        int result = calculator.calculate(str);
        System.out.println("结果为：" + result);

        String exp = "6+6";
        AbstractCalculator cal = new com.designmode.behaviour.fatherson.template.Plus();
        int result1 = cal.calculate(exp, "\\+");
        System.out.println("结果为：" + result1);
    }

}
