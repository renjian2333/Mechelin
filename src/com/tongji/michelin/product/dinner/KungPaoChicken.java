package com.tongji.michelin.product.dinner;

import com.tongji.michelin.product.drink.Drink;
import com.tongji.michelin.rawmaterial.foodmaterial.CocoaBean;
import com.tongji.michelin.rawmaterial.foodmaterial.Water;

/**
 * @classname KungPaoChicken
 */
public class KungPaoChicken extends Dinner {

    // constructor
    public KungPaoChicken() {
        super("KungPaoChicken", 18, 10, 0.78);
    }

    // constructor
    public KungPaoChicken(Drink drink) {
        super("KungPaoChicken", 18, 10, 0.78, drink);
        this.initIngredientList();
    }

    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Water());
    }

    @Override

    public String getNameWithDrink() {
        return drink.getDrink() + " KungPaoChicken";
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "subclass : KungPaoChicken";
    }

    @Override
    public void dispaly() {

    }
}
