package com.designmode.behaviour.classstate.state;

/**
 * 状态模式
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void methodOne() {
        /*if (state.getValue().equals("state1")) {
            state.methodOne();
        } else if (state.getValue().equals("state2")) {
            state.methodTwo();
        }*/

        switch (state.getValue()) {
            case "state1" :
                state.methodOne();
                break;
            case "state2" :
                state.methodTwo();
                break;
            default:break;
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
