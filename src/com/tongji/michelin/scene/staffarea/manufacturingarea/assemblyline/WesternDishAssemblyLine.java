package com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline;

import com.tongji.michelin.product.dinner.Dinner;
import com.tongji.michelin.product.dinner.WesternDish;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname MilkChocolateAssemblyLine
 * @description assembly line for milk chocolate
 * @date 2020/11/15 16:46
 */
public class WesternDishAssemblyLine extends DishAssemblyLine {

    /**
     * Specific return, milk chocolate factory can only return milk chocolate
     * @return  MilkChocolate;
     */
    @Override
    public Dinner getDinner() {
        return new WesternDish();
    }
}
