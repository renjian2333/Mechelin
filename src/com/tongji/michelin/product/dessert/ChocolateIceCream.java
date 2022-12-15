package com.tongji.michelin.product.dessert;

import com.tongji.michelin.rawmaterial.foodmaterial.CocoaBean;
import com.tongji.michelin.rawmaterial.foodmaterial.Milk;
import com.tongji.michelin.rawmaterial.foodmaterial.Sugar;
import com.tongji.michelin.rawmaterial.foodmaterial.Water;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateIceCream
 * @description TODO
 * @date 2020/11/8 15:26
 */
public class ChocolateIceCream extends Dessert {

// constructor
    public ChocolateIceCream() {
        super("Chocolate Ice-cream", 12, 200);
        this.initIngredientList();
    }

    /**
     * initialize the ingredient list of chocolate ice-cream
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Water());
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "ChocolateIceCream";
    }
}
