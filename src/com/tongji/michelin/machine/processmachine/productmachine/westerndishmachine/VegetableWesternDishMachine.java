package com.tongji.michelin.machine.processmachine.productmachine.westerndishmachine;

/**
 * @classname ConcreteMilkMachine2
 */
public class VegetableWesternDishMachine extends WesternDishMachine {
    public VegetableWesternDishMachine() {
        this.setMachineNum("002");
    }

    public VegetableWesternDishMachine(String number) {
        super(number);
    }

    @Override
    public void useMeat() {
        westernDish.setMeatNum(150.0);
        System.out.println("Use meatNum = 150.0\n");
    }

    @Override
    public void useVegetable() {
        westernDish.setVegetableNum(200.0);
        System.out.println("Use vegetableNum = 200.0\n");
    }

    @Override
    public void useSalt() {
        westernDish.setSaltNum(5.0);
        System.out.println("Use saltNum = 5.0\n");
    }

    public String toString() {
        return "class VegetableWesternDishMachine extends WesternDishMachine";
    }
}