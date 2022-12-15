package com.tongji.michelin.product.dinner;

import com.tongji.michelin.product.drink.Drink;
import com.tongji.michelin.rawmaterial.foodmaterial.CocoaBean;
import com.tongji.michelin.rawmaterial.foodmaterial.Water;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname DarkChocolate
 * @description this is dark chocolate
 * @date 2020/11/8 15:15
 */
public class KungPaoChicken extends Dinner {

    // constructor
    public KungPaoChicken() {
        super("Dark chocolate", 18, 10, 0.78);
    }

    // constructor
    public KungPaoChicken(Drink drink) {
        super("Dark chocolate", 18, 10, 0.78, drink);
        this.initIngredientList();
    }

    /**
     * initialize the ingredient list of dark chocolate.
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Water());
    }

    @Override
    /**
     * return the chocolate's name with the sandwich it contains
     * @return
     */
    public String getNameWithDrink() {
        return drink.getDrink() + " DarkChocolate";
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "subclass : DarkChocolate";
    }

    @Override
    public void dispaly() {

    }
}
