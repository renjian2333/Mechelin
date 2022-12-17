package com.tongji.michelin.product.dessert;

import com.tongji.michelin.rawmaterial.foodmaterial.*;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname ChocolateCake
 * @description this is chocolate cake, the feature of which is the size.
 * Here I've defined size to stand for the radius of the cake.
 * @date 2020/11/8 15:25
 */
public class MangoIceCream extends Dessert {

// fields
    protected int size; //how many inches is its radius

//constructor

    /**
     * @param size
     */
    public MangoIceCream(int size) {
        super("Mango Ice-cream", 1, size * size * 100);
        this.size = size;
        this.initIngredientList();
    }

// methods

    /**
     * initialize the ingredient list of chocolate cake
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Egg());
        super.ingredientList.add(new Flour());
        super.ingredientList.add(new Butter());
        super.ingredientList.add(new EdibleGoldLeaf());
    }

    /**
     * @return cake's size
     */
    public int getSize() {
        return this.size;
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "MangoIceCream";
    }

}
