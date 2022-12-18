package com.tongji.michelin.rawmaterial.foodmaterial;


/**
 * @classname Milk
 * @description milk the food raw material
 */
public class Milk extends FoodMaterial {
    /**
     * ctor of Milk
     * <p>
     * This ctor sets state to LIQUID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Milk(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.LIQUID);
    }

    public Milk() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Milk.process()
         */
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy milk!");
        return (Milk) super.clone();
    }
}
