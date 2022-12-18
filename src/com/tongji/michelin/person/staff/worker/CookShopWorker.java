package com.tongji.michelin.person.staff.worker;

import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.scene.staffarea.StaffArea;

/**
 * @author zqr
 * @classname CookShopWorker
 * @description worker in the workshop
 */
public class CookShopWorker extends Worker {

    public CookShopWorker(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    public CookShopWorker(String name, int age, Sex sex, int salary) {
        super(name, age, sex, salary);
    }

    @Override
    public void work() {
        System.out.println("The cookShop worker " + this.name + " is working.");
    }

    @Override
    public void rest() {
        System.out.println("The cookShop worker " + this.name + " goes to rest.");
    }

    @Override
    public void feedBack() {
        System.out.println("The cookShop worker " + this.name + " feed back things to the dining room manager");
        this.department.getManager().receiveFeedBack();
    }
}
