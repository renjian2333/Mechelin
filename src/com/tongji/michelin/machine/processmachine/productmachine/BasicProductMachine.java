package com.tongji.michelin.machine.processmachine.productmachine;


/**
 * @classname BasicProductMachine
 * @description Machine for producing a large quantity of products.
 */
public class BasicProductMachine extends ProductMachine {
    public BasicProductMachine(String type, String machineNum) {
        super(type, machineNum, 40, 1, 500);
    }

    public BasicProductMachine(String type, String machineNum, double age) {
        super(type, machineNum, age, 40, 1, 500);
    }

    public String toString() {
        return "class BasicProductMachine";
    }
}
