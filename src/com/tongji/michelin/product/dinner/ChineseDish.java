package com.tongji.michelin.product.dinner;


import com.tongji.michelin.product.drink.Drink;

/**
 * @author Zeus Lee
 * @project chocolateFactory
 * @classname AlmondChocolate
 * @description AlmondChocolate
 * @date 2020/11/15 16:31
 */

/**
 * modified
 * @author Kerr
 * impelement abstract method getNameWithSandwich() to make it can work.
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
        System.out.println("this is AlmondChocolate!");
    }

    @Override
    /**
     * return the chocolate's name with the sandwich it contains
     * @return
     */
    public String getNameWithDrink() {
        return null;
    }

    @Override
    protected void initIngredientList() {

    }
}
