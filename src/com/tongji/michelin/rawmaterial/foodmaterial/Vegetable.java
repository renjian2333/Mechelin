package com.tongji.michelin.rawmaterial.foodmaterial;

public class Vegetable extends FoodMaterial{
    /**
     * ctor of Vegetable
     * <p>
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Vegetable(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }

    public Vegetable() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Vegetable.process()
         */
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy vegetable!");
        return (Vegetable) super.clone();
    }
}
