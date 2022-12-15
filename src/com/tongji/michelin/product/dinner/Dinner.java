package com.tongji.michelin.product.dinner;


import com.tongji.michelin.product.Product;
import com.tongji.michelin.product.drink.Maotai;
import com.tongji.michelin.product.drink.Drink;


/**
 * @author Kerr
 * @project chocolateFactory
 * @classname Chocolate
 * @description the basic class of chocolate
 * @date 2020/11/8 15:55
 */


/**
 * @modifiedBy Miracle Ray, Zeus Lee
 * @date 2020/11/17 17:15
 * @description add an attribute of chocolate, sandwich, when construct it.
 */
public abstract class Dinner extends Product {

//fields
    /**
     * the content of Cocoa
     * dark chocolate -> 0.78
     * sandwich chocolate -> 0.5
     * matcha chocolate -> 0.4
     * milk chocolate -> 0.3
     * white chocolate -> 0.1
     */
    public double cocoaContent;
    protected Drink drink;

//constructor

    /**
     * @param name
     * @param shelfLife how many month
     * @param content   cocoa's content
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


    /**
     * this method to show class is some Chocolate , To subclass implementation
     */
    public abstract void dispaly();

    /**
     * return the chocolate's name with the sandwich it contains
     * @return
     */
    public abstract String getNameWithDrink();
}
