package com.tongji.michelin.machine.processmachine.qualitytestmachine;

import com.tongji.michelin.machine.processmachine.ProcessMachine;
import com.tongji.michelin.product.Product;

/**
 * @classname QualityTestMachine
 * @description This is quality test machine
 */
public class QualityTestMachine extends ProcessMachine {


    public QualityTestMachine(String type)
    {
        super(type);
    }
    /**
     * Represent the quality test machine
     */
    public QualityTestMachine(String type, String machineNum, double lifeYear, double lossCoefficient, int maxCapacity) {
        super(type, machineNum, lifeYear, lossCoefficient, maxCapacity);
    }


    @Override
    public void process(Product product, int productNum) {
        product.packaging();
    }

    public String toString() {
        return "class QualityTestMachine";
    }
}
