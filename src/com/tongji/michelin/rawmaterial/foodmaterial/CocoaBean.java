package com.tongji.michelin.rawmaterial.foodmaterial;


/**
 * @classname CocoaBean
 * @description cocoa bean the food raw material
 */
public class CocoaBean extends FoodMaterial {

    /**
     * ctor of CocoaBean
     * <p>
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public CocoaBean(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }

    public CocoaBean() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement CocoaBean.process()
         */
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy cocoa bean!");
        return (CocoaBean) super.clone();
    }
}
