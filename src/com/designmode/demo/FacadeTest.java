package com.designmode.demo;

import com.designmode.structure.facade.Computer;

public class FacadeTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }

}
