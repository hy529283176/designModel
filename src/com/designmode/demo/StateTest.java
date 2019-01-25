package com.designmode.demo;

import com.designmode.behaviour.classstate.state.Context;
import com.designmode.behaviour.classstate.state.State;

public class StateTest {

    public static void main(String[] args) {

        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.methodOne();

        //设置第二种状态
        state.setValue("state2");
        context.methodOne();
    }

}
