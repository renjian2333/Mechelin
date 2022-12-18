package com.tongji.michelin.product.dessert;

import com.tongji.michelin.rawmaterial.foodmaterial.*;

/**
 * @classname MatchaIceCream
 */
public class MatchaIceCream extends Dessert {

//fields
    public enum Shape {CAT, DOG, HORSE, HUMAN, APPLE, STAR, TREE, SUN}

    protected Shape shape;

// constructor
public MatchaIceCream(){
    super("Matcha Ice-cream", 6, 7);
    this.initIngredientList();
}
    /**
     * @param shape
     */
    public MatchaIceCream(Shape shape) {
        super("Matcha Ice-cream", 6, 7);
        this.shape = shape;
        this.initIngredientList();
    }

    // methods
    @Override
    public void packaging() {

    }

    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new Butter());
        super.ingredientList.add(new Egg());
        super.ingredientList.add(new Flour());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Water());
    }

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
        return "MatchaIceCream";
    }

}
