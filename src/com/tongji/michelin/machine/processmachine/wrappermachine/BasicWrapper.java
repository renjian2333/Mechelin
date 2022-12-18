package com.tongji.michelin.machine.processmachine.wrappermachine;

import com.tongji.michelin.machine.processmachine.wrappermachine.WrapperMachine;

/**
 * @classname BasicWrapper
 * @description Machine for wrapping a small quantity of products.
 */
public class BasicWrapper extends WrapperMachine {
    public BasicWrapper(String type, String machineNum) {
        super(type, machineNum, 30, 1.5, 250);
    }

    public BasicWrapper(String type, String machineNum, double age) {
        super(type, machineNum, age, 30, 1.5, 250);
    }

    public String toString() {
        return "class BasicWrapper";
    }
}
