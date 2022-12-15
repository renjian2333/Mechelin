package com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline;

import com.tongji.michelin.product.dinner.Dinner;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname ChocolatesMachineAssemblyLine
 * @description abstract assembly line class of chocolate factory
 * @date 2020/11/15 16:26
 */
public abstract class DishAssemblyLine {

    /**
     * Return the corresponding product,
     * that is, chocolate, and how to implement it to the subclass
     * @return Chocolate for Factory;
     */
    public abstract Dinner getDinner();

}
