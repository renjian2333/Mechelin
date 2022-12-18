package com.tongji.michelin.machine.processmachine.productmachine.westerndishmachine;

import com.tongji.michelin.machine.processmachine.productmachine.BasicProductMachine;
import com.tongji.michelin.product.dinner.WesternDish;

/**
 * @classname WesternDishMachine
 * @description This machine WesternDish with different concentrations of components.
 */
public abstract class WesternDishMachine extends BasicProductMachine {
    protected WesternDish westernDish;

    public WesternDishMachine() {
        super("WesternDishMachine", "000");
        westernDish = new WesternDish();
    }

    public WesternDishMachine(String number) {
        super("WesternDishMachine", number);
        westernDish = new WesternDish();
    }

    /**
     * to get product
     *
     * @return a MilkChocolate
     */
    public WesternDish getWesternDish() {
        return westernDish;
    }

    /**
     * set the amount of chocolate in the product
     */
    public abstract void useMeat();

    /**
     * set the amount of sugar in the product
     */
    public abstract void useVegetable();

    /**
     * set the amount of milk in the product
     */
    public abstract void useSalt();

    public String toString() {
        return "class WesternDishMachine";
    }
}