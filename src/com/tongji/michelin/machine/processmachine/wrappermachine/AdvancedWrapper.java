package com.tongji.michelin.machine.processmachine.wrappermachine;

import com.tongji.michelin.machine.processmachine.wrappermachine.WrapperMachine;

/**
 * @classname AdvancedWrapper
 * @description Machine for wrapping a large quantity of products.
 */
public class AdvancedWrapper extends WrapperMachine {
    public AdvancedWrapper(String type, String machineNum) {
        super(type, machineNum, 50, 1.2, 500);
    }

    public AdvancedWrapper(String type, String machineNum, double age) {
        super(type, machineNum, age, 50, 1.2, 500);
    }

    public String toString() {
        return "class AdvancedWrapper";
    }
}
