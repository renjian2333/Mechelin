package com.tongji.michelin.rawmaterial.foodmaterial;


/**
 * @classname Butter
 * @description butter the food raw material
 */
public class Butter extends FoodMaterial {
    /**
     * ctor of Butter
     * <p>
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Butter(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }

    public Butter() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Butter.process()
         */
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy butter!");
        return (Butter) super.clone();
    }
}
