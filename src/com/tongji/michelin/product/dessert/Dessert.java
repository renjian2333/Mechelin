package com.tongji.michelin.product.dessert;

import com.tongji.michelin.product.Product;

/**
 * @Author: qxh
 * @Date: 2022/12/15
 * @Description: TODO
 */
public abstract class Dessert extends Product {
    /**
     * @param name
     * @param shelfLife how many month
     * @param weight
     */
    public Dessert(String name, int shelfLife, int weight) {
        super(name, shelfLife, weight);
    }

    @Override
    protected void initIngredientList() {

    }
}
