package com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline;

import com.tongji.michelin.product.dinner.ChineseDish;
import com.tongji.michelin.product.dinner.Dinner;

/**
 * @classname ChineseDishAssemblyLine
 */
public class ChineseDishAssemblyLine extends DishAssemblyLine {

    @Override
    public Dinner getDinner() {
        return new ChineseDish();
    }
}
