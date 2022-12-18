package com.tongji.michelin.product.dinner;


import com.tongji.michelin.product.Product;
import com.tongji.michelin.product.drink.Maotai;
import com.tongji.michelin.product.drink.Drink;



public abstract class Dinner extends Product {

//fields
    public double cocoaContent;
    protected Drink drink;

//constructor

    /**
     * @param name
     * @param shelfLife how many month
     * @implNote this class can not be directly used to create objects, so it's constructor is protected
     */
    protected Dinner(String name, int shelfLife, int weight, double content, Drink drink) {
        super(name, shelfLife, weight);
        this.cocoaContent = content;
        this.drink = drink;
    }

    protected Dinner(String name, int shelfLife, int weight, double content) {
        super(name, shelfLife, weight);
        this.cocoaContent = content;
        this.drink = new Maotai();
    }

    public abstract void dispaly();

    public abstract String getNameWithDrink();
}
