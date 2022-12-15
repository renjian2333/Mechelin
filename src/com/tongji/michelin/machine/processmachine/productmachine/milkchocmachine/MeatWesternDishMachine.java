package com.tongji.michelin.machine.processmachine.productmachine.milkchocmachine;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname ConcreteMilkMachine
 * @description This machine produces milk chocolate with CocoaBean=200, Sugar=10, Milk=1.
 * @date 2020/11/14 17:53
 */
public class MeatWesternDishMachine extends WesternDishMachine {
    public MeatWesternDishMachine() {
        this.setMachineNum("001");
    }

    public MeatWesternDishMachine(String number) {
        super(number);
    }

    @Override
    public void useCocoaBean() {
        westernDish.setCocoaBeanNum(200.0);
        System.out.println("Use cocoaBeanNum = 200.0\n");
    }

    @Override
    public void useSugar() {
        westernDish.setSugarNum(10.0);
        System.out.println("Use sugarNum = 10.0\n");
    }

    @Override
    public void useMilk() {
        westernDish.setMilkNum(1.0);
        System.out.println("Use milkNum = 1.0\n");
    }

    public String toString() {
        return "class NormalMilkChocMachine extends MilkChocMachine";
    }
}