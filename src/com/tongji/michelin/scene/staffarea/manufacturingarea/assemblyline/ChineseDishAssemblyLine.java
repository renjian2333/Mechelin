package com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline;

import com.tongji.michelin.product.dinner.ChineseDish;
import com.tongji.michelin.product.dinner.Dinner;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname AlmondChocolateAssemblyLine
 * @description assembly line for almond chocolate
 * @date 2020/11/15 16:46
 */
public class ChineseDishAssemblyLine extends DishAssemblyLine {

    /**
     * Specific return, milk chocolate factory can only return almond chocolate
     * @return  MilkChocolate;
     */
    @Override
    public Dinner getDinner() {
        return new ChineseDish();
    }
}
