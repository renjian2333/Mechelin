package com.tongji.michelin.product.dinner;

import com.tongji.michelin.product.drink.Drink;
import com.tongji.michelin.rawmaterial.foodmaterial.CocoaBean;
import com.tongji.michelin.rawmaterial.foodmaterial.Milk;
import com.tongji.michelin.rawmaterial.foodmaterial.Sugar;

import java.io.Serializable;

/**
 * @author Kerr
 * @project chocolateFactory
 * @classname MilkChocolate
 * @description this is milk chocolate.
 * @date 2022/11/8 15:16
 */
public class WesternDish extends Dinner implements Serializable, Cloneable {

    //fields
    protected double milkContent;
    private double cocoaBeanNum = 100;
    private double sugarNum = 5;
    private double milkNum = 0.5;

    //constructor
    public WesternDish() {
        super("WesternDish", 18, 15, 0.3);
    }

    //constructor
    public WesternDish(Drink drink) {
        super("WesternDish", 18, 15, 0.3, drink);
        this.milkContent = 0.4;
        this.initIngredientList();
    }

    /**
     * @return milk's content
     */
    public double getMilkContent() {
        return this.milkContent;
    }

    /**
     * how many grams' milk is needed;
     *
     * @return
     */
    public double getMilkWeight() {
        return this.milkContent * this.weight;
    }

    /**
     * initialize the ingredient list of the milk chocolate
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Milk());
    }

    /**
     * return the chocolate's name with the sandwich it contains
     * @return
     */
    public String getNameWithDrink() {
        return drink.getDrink() + " WesternDish";
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "subclass : Western Dish";
    }


    public void setCocoaBeanNum(double cocoaBeanNum) {
        this.cocoaBeanNum = cocoaBeanNum;
    }

    public void setSugarNum(double sugarNum) {
        this.sugarNum = sugarNum;
    }

    public void setMilkNum(double milkNum) {
        this.milkNum = milkNum;
    }

    public double getCocoaBeanNum() {
        return cocoaBeanNum;
    }

    public double getMilkNum() {
        return milkNum;
    }

    public double getSugarNum() {
        return sugarNum;
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
        return this.cocoaBeanNum == westernDish.getCocoaBeanNum() && this.sugarNum == westernDish.getSugarNum() && this.milkNum == westernDish.getMilkNum();
    }
}