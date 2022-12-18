package com.tongji.michelin.product.drink;

/**
 * @classname Liqueur
 * @description build for Bridge
 */

public class Wine implements Drink {
// methods
    @Override
    public String getDrink() {
        return "Liqueur";
    }
}

