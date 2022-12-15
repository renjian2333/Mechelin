package com.tongji.michelin.machine.processmachine.productmachine;

import com.tongji.michelin.machine.processmachine.ProcessMachine;
import com.tongji.michelin.product.Product;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname ProductMachine
 * @description Inherited from ProcessMachine, this class is the abstract class of all the product machines.
 * @date 2020/11/8 19:25
 */
public abstract class ProductMachine extends ProcessMachine {
    public ProductMachine(String type, String machineNum, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, lifeYear, lossCoefficient, maxCapacity);
    }

    public ProductMachine(String type, String machineNum, double age, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, age, lifeYear, lossCoefficient, maxCapacity);
    }

    @Override
    public void process(Product product, int productNum) {
        System.out.println("Successfully produce " + productNum + " " + product.getName());
        product.gotoNextState();
    }

    public String toString() {
        return "class ProductMachine";
    }
}
