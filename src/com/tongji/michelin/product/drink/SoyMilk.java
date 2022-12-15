package com.tongji.michelin.product.drink;

/**
 * @author Miracle Ray
 * @project chocolateFactory
 * @classname Hazelnut
 * @description Hazelnut sandwich;build for Bridge
 * @date 2020/11/17 17:15
 */

public class SoyMilk implements Drink {
// methods
    @Override
    public String getDrink() {
        return "Hazelnut";
    }
}
