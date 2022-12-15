package com.tongji.michelin.product.drink;

/**
 * @author Miracle Ray
 * @project chocolateFactory
 * @classname Liqueur
 * @description Liqueur sandwich;build for Bridge
 * @date 2020/11/17 17:11
 */

public class Wine implements Drink {
// methods
    @Override
    public String getDrink() {
        return "Liqueur";
    }
}

