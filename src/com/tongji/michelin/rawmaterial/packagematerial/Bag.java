package com.tongji.michelin.rawmaterial.packagematerial;


/**
 * @classname Bag
 * @description bag the package material
 */
public class Bag extends PackageMaterial {
    /**
     * ctor of Bag
     *
     * @param initialQuant initial quantity
     */
    public Bag(double initialQuant) {
        super(initialQuant);
    }

    public Bag() {
        this(1);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy a bag!");
        return (Bag) super.clone();
    }
}
