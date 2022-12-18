package com.tongji.michelin.person.staff.worker;

import com.tongji.michelin.person.staff.Staff;
import com.tongji.michelin.product.Product;
import com.tongji.michelin.product.dinner.*;
import com.tongji.michelin.product.dessert.ChocolateCake;
import com.tongji.michelin.product.dessert.MatchaIceCream;
import com.tongji.michelin.product.dessert.ChocolateIceCream;
import com.tongji.michelin.product.dessert.ChocolateWafer;
import com.tongji.michelin.scene.staffarea.StaffArea;

/**
 * @classname Worker
 * @description A low-level employee of a factory, attached to a department 工厂的底层员工，隶属于某个部门
 */
public abstract class Worker extends Staff {

    public String identity = "worker";

    /**
     * command pattern
     * workers are invokers, they invoke machines to carry on the command -> produce product
     */
    private Product kungPaoChicken, matchaChocolate, westernDish, steak, chocolateCake, chocolateWafer, chocolateIceCream, matchaIceCream;
    public Worker(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
        if (department != null) {
            department.addWorker(this);
        }

        this.kungPaoChicken = new KungPaoChicken();
        this.matchaChocolate = new MatchaChocolate();
        this.westernDish = new WesternDish();
        this.steak = new Steak();
        this.chocolateCake = new ChocolateCake(5);
        this.matchaIceCream = new MatchaIceCream(MatchaIceCream.Shape.STAR);
        this.chocolateIceCream = new ChocolateIceCream();
        this.chocolateWafer = new ChocolateWafer();
    }

    public Worker(String name, int age, Sex sex, int salary) {
        this(name, age, sex, salary, null);
    }

    public void produceKungPaoChicken() {
        this.kungPaoChicken.producing();
    }

    public void produceWhiteChocolate() {
        this.steak.producing();
    }

    public void produceMatchaChocolate() {
        this.matchaChocolate.producing();
    }

    public void produceMilkChocolate() {
        this.westernDish.producing();
    }

    public void produceChocolateCake() {
        this.chocolateCake.producing();
    }

    public void produceChocolateCookie() {
        this.matchaIceCream.producing();
    }

    public void produceChocolateIceCream() {
        this.chocolateIceCream.producing();
    }

    public void produceChocolateWafer() {
        this.chocolateWafer.producing();
    }

    public void processDarkChocolate() {
        this.kungPaoChicken.producing();
    }

    public void processWhiteChocolate() {
        this.steak.producing();
    }

    public void processMatchaChocolate() {
        this.matchaChocolate.producing();
    }

    public void processMilkChocolate() {
        this.westernDish.producing();
    }

    public void processChocolateCake() {
        this.chocolateCake.producing();
    }

    public void processChocolateCookie() {
        this.matchaIceCream.producing();
    }

    public void processChocolateIceCream() {
        this.chocolateIceCream.producing();
    }

    public void processChocolateWafer() {
        this.chocolateWafer.producing();
    }

    /**
     * @modified by Ray
     */
    public void respondMorning() {
        System.out.println("保，早安！噢，抱歉。。。早，保安！");
    }

    /**
     * set the initial asset of the worker
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 10000;
    }

    @Override
    public String toString() {
        return "class Worker extends Staff";
    }

    /**
     * work
     */
    public abstract void work();

    /**
     * rest
     */
    public abstract void rest();

    /**
     * feedback
     */

    public abstract void feedBack();
}
