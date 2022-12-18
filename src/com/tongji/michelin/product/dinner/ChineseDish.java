package com.tongji.michelin.product.dinner;


import com.tongji.michelin.product.drink.Drink;

/**
 * @classname ChineseDish
 */
public class ChineseDish extends Dinner {

// constructor
    public ChineseDish() {
        super(null, 0, 0, 0.0);
    }

    public ChineseDish(String name, int shelfLife, int weight, double content, Drink drink) {
        super(name, shelfLife, weight, content, drink);
    }

    /**
     * This method can show the type of this class。
     */
    @Override
    public void dispaly() {
        System.out.println("this is ChineseDish!");
    }

    @Override

    public String getNameWithDrink() {
        return null;
    }

    @Override
    protected void initIngredientList() {

    }
}
