package com.tongji.michelin.product.dessert;

import com.tongji.michelin.rawmaterial.foodmaterial.*;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateWafer
 * @description this is chocolate wafer
 * @date 2020/11/8 15:27
 */
public class ChocolateWafer extends Dessert {

// constructor
    public ChocolateWafer() {
        super("Chocolate Wafer", 18, 100);
        this.initIngredientList();
    }

// methods

    /**
     * initialize the ingredient list of chocolate wafer
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Butter());
        super.ingredientList.add(new Egg());
        super.ingredientList.add(new Flour());
        super.ingredientList.add(new Nut());
        super.ingredientList.add(new Sugar());
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "ChocolateWafer";
    }
}
