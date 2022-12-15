package com.tongji.michelin.machine.processmachine.productmachine.milkchocmachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname ConcreteMilkMachine2
 * @description This machine produces milk chocolate with CocoaBean=150, Sugar=20, Milk=5.
 * @date 2020/11/14 18:04
 */
public class VegetableWesternDishMachine extends WesternDishMachine {
    public VegetableWesternDishMachine() {
        this.setMachineNum("002");
    }

    public VegetableWesternDishMachine(String number) {
        super(number);
    }

    @Override
    public void useCocoaBean() {
        westernDish.setCocoaBeanNum(150.0);
        System.out.println("Use cocoaBeanNum = 150.0\n");
    }

    @Override
    public void useSugar() {
        westernDish.setSugarNum(20.0);
        System.out.println("Use sugarNum = 20.0\n");
    }

    @Override
    public void useMilk() {
        westernDish.setMilkNum(5.0);
        System.out.println("Use milkNum = 5.0\n");
    }

    public String toString() {
        return "class ThickMilkChocMachine extends MilkChocMachine";
    }
}