package com.designmode.behaviour.classstate.state;

/**
 * 状态模式
 */
public class State {

    private String value;

    public void methodOne() {
        System.out.println("execute the first opt!");
    }

    public void methodTwo() {
        System.out.println("execute the second opt!");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
