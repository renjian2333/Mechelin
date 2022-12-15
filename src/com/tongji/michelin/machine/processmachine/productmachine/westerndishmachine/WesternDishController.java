package com.tongji.michelin.machine.processmachine.productmachine.westerndishmachine;

import com.tongji.michelin.product.dinner.WesternDish;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname MilkChocController
 * @description This machine controls the production process of milkChocMachine.
 * @date 2020/11/14 18:07
 */
public class WesternDishController {
    public WesternDishMachine westernDishMachine;

    public WesternDishController(WesternDishMachine westernDishMachine) {
        this.westernDishMachine = westernDishMachine;
        String name = westernDishMachine.getMachineID();
        System.out.println(name + " has been set to produce.\n");
        westernDishMachine.setAimProcessNum(100);
    }

    /**
     * first determine the amount of each part of the raw materials, and then execute the production
     *
     * @return a int representing output
     */
    public int startProduce() {
        westernDishMachine.useCocoaBean();
        westernDishMachine.useSugar();
        westernDishMachine.useMilk();
        int outNum = westernDishMachine.run(westernDishMachine.getMilkChocolate());
        if (outNum == 0) {
            System.out.println("Failing producing MilkChocolate!");
        } else {
            // System.out.println("Successfully producing " + outNum + " MilkChocolate!");
        }
        return outNum;
    }

    /**
     * return the product
     *
     * @return a MilkChocolate
     */
    public WesternDish getWesternDish() {
        return westernDishMachine.getMilkChocolate();
    }

    public String toString() {
        return "class MilkChocController";
    }
}
