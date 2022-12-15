package com.tongji.michelin.product.dessert;

import com.tongji.michelin.rawmaterial.foodmaterial.*;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateCookie
 * @description this is chocolate cookie, cookie's feature is its shape. Here I've defined a enum called Shape.
 * @date 2020/11/8 15:22
 */
public class MatchaIceCream extends Dessert {

//fields
    public enum Shape {CAT, DOG, HORSE, HUMAN, APPLE, STAR, TREE, SUN}

    protected Shape shape;

// constructor

    /**
     * @param shape
     */
    public MatchaIceCream(Shape shape) {
        super("Chocolate Cookie", 6, 7);
        this.shape = shape;
        this.initIngredientList();
    }

    // methods
    @Override
    public void packaging() {

    }

    /**
     * initialize the ingredient list of chocolate cookie
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Butter());
        super.ingredientList.add(new Egg());
        super.ingredientList.add(new Flour());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Water());
    }

    /**
     * @return the shape of cookie
     */
    public Shape getShape() {
        return this.shape;
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "ChocolateCookie";
    }

}
