package com.tongji.michelin.machine.processmachine.productmachine.westerndishmachine;

/**
 * @classname MeatWesternDishMachine
 */
public class MeatWesternDishMachine extends WesternDishMachine {
    public MeatWesternDishMachine() {
        this.setMachineNum("001");
    }

    public MeatWesternDishMachine(String number) {
        super(number);
    }

    @Override
    public void useMeat() {
        westernDish.setMeatNum(200.0);
        System.out.println("Use meatNum = 200.0\n");
    }

    @Override
    public void useVegetable() {
        westernDish.setVegetableNum(100.0);
        System.out.println("Use vegetableNum = 100.0\n");
    }

    @Override
    public void useSalt() {
        westernDish.setSaltNum(5.0);
        System.out.println("Use saltNum = 5.0\n");
    }

    public String toString() {
        return "class MeatWesternDishMachine extends WesternDishMachine";
    }
}