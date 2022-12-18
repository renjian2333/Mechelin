package com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline;

import com.tongji.michelin.product.dinner.Dinner;
import com.tongji.michelin.product.dinner.WesternDish;

public class WesternDishAssemblyLine extends DishAssemblyLine {

    @Override
    public Dinner getDinner() {
        return new WesternDish();
    }
}
