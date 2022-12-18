package com.tongji.michelin.product.dinner;

import com.tongji.michelin.product.drink.Drink;
import com.tongji.michelin.rawmaterial.foodmaterial.*;

import java.io.Serializable;

/**
 * @classname WesternDish
 * @description this is WesternDish
 */
public class WesternDish extends Dinner implements Serializable, Cloneable {

    //fields
    private double meatNum = 5;
    private double vegetableNum = 0.5;


    //constructor
    public WesternDish() {
        super("WesternDish", 18, 15, 0.3);
    }

    //constructor
    public WesternDish(Drink drink) {
        super("WesternDish", 18, 15, 0.3, drink);
        this.initIngredientList();
    }

    public void setMeatNum(double meatNum) {
        this.meatNum = meatNum;
    }

    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new Meat());
        super.ingredientList.add(new Vegetable());
    }

    public String getNameWithDrink() {
        return drink.getDrink() + " WesternDish";
    }

    @Override
    public String toString() {
        return "subclass : Western Dish";
    }

    public void setVegetableNum(double sugarNum) {
        this.meatNum = sugarNum;
    }

    public void setSaltNum(double milkNum) {
        this.vegetableNum = milkNum;
    }

    public double getVegetableNum() {
        return vegetableNum;
    }

    public double getMeatNum() {
        return meatNum;
    }

    @Override
    public void dispaly() {
        System.out.println("this is WesternDish!!");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(WesternDish westernDish) {
        return  this.meatNum == westernDish.getMeatNum() && this.vegetableNum == westernDish.getVegetableNum();
    }
}