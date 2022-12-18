package com.tongji.michelin.scene.decorator;

/**
 * @classname FireHydrant
 * @description this is a residence with fire hydrant
 */
public class FireHydrant extends ResidenceDecorator {

    public FireHydrant() {
        this(null);
    }

    /**
     * Add a fire hydrant to the residence
     */
    public FireHydrant(DecoratorComponent r) {
        super(r);
        System.out.println("A fire hydrant has been added");
    }

    /**
     * Return the cost of the residence WITH fire hydrant
     */
    @Override
    public double getBuildCost() {
        return residence.getBuildCost() + 1000; //Infrared alarm 100yuan/per
    }


    /**
     * String representing the residence
     */
    @Override
    public String getDescription() {
        return residence.getDescription();
    }

    @Override
    public String toString() {
        return "class FireHydrant extends ResidenceDecorator";
    }
}

