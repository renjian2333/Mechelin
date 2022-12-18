package com.tongji.michelin.rawmaterial.foodmaterial;

public class Meat extends FoodMaterial{
    /**
     * ctor of Meat
     * <p>
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Meat(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }

    public Meat() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Meat.process()
         */
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy meat!");
        return (Meat) super.clone();
    }
}
