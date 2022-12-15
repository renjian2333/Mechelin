package com.tongji.michelin.machine.processmachine.productmachine.westerndishmachine;

import com.tongji.michelin.machine.processmachine.productmachine.BasicProductMachine;
import com.tongji.michelin.product.dinner.WesternDish;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname DarkChocMachine
 * @description This machine produces milk chocolate with different concentrations of components.
 * @date 2020/11/14 10:09
 */
public abstract class WesternDishMachine extends BasicProductMachine {
    protected WesternDish westernDish;

    public WesternDishMachine() {
        super("MilkChocMachine", "000");
        westernDish = new WesternDish();
    }

    public WesternDishMachine(String number) {
        super("MilkChocMachine", number);
        westernDish = new WesternDish();
    }

    /**
     * to get product
     *
     * @return a MilkChocolate
     */
    public WesternDish getMilkChocolate() {
        return westernDish;
    }

    /**
     * set the amount of chocolate in the product
     */
    public abstract void useCocoaBean();

    /**
     * set the amount of sugar in the product
     */
    public abstract void useSugar();

    /**
     * set the amount of milk in the product
     */
    public abstract void useMilk();

    public String toString() {
        return "class MilkChocMachine";
    }
}