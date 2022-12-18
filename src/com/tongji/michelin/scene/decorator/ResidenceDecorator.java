package com.tongji.michelin.scene.decorator;

/**
 * @classname ResidenceDecorator
 * @description this represents the decoration of residence
 */
public abstract class ResidenceDecorator implements DecoratorComponent {

    /**
     * Residence decorated by the ResidenceDecorator
     */
    protected DecoratorComponent residence;

    public ResidenceDecorator() {
        this(null);
    }

    /**
     * Represents the decorated residence
     */
    public ResidenceDecorator(DecoratorComponent r) {
        residence = r;
    }

    @Override
    public String toString() {
        return "abstract class ResidenceDecorator extends Residence";
    }
}
