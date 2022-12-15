package com.tongji.michelin.product.dinner;

import com.tongji.michelin.product.drink.Drink;
import com.tongji.michelin.rawmaterial.foodmaterial.CocoaBean;
import com.tongji.michelin.rawmaterial.foodmaterial.Matcha;
import com.tongji.michelin.rawmaterial.foodmaterial.Sugar;
import com.tongji.michelin.rawmaterial.foodmaterial.Water;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname MatchaChocolate
 * @description this is matcha chocolate
 * @date 2020/11/8 15:41
 */
public class MatchaChocolate extends Dinner {

    //fields
    protected double matchaContent;

    // constructor
    public MatchaChocolate() {
        super("Matcha chocolate", 18, 8, 0.4);
    }

    // constructor
    public MatchaChocolate(Drink drink) {
        super("Matcha chocolate", 18, 8, 0.4, drink);
        this.matchaContent = 0.2;
        this.initIngredientList();
    }

// methods

    /**
     * @return matcha's content
     */
    public double getMatchaContent() {
        return this.matchaContent;
    }

    /**
     * how many grams' matcha is needed
     *
     * @return
     */
    public double getMatchaWieght() {
        return this.matchaContent * this.weight;
    }

    /**
     * initialize the ingredient list of matcha chocolate
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Matcha());
    }

    @Override
    /**
     * return the chocolate's name with the sandwich it contains
     * @return
     */
    public String getNameWithDrink() {
        return drink.getDrink() + " MatchaChocolate";
    }

    /**
     * override the to string method
     *
     * @return a String
     */
    @Override
    public String toString() {
        return "Subclass : Matcha Chocolate";
    }

    @Override
    public void dispaly() {

    }
}
