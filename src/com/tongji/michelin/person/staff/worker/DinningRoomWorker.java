package com.tongji.michelin.person.staff.worker;

import com.tongji.michelin.scene.staffarea.StaffArea;

/**
 * @classname DinningRoomWorker
 * @description worker in the dinning room
 */
public class DinningRoomWorker extends Worker {

    public DinningRoomWorker(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    public DinningRoomWorker(String name, int age, Sex sex, int salary) {
        super(name, age, sex, salary);
    }

    @Override
    public void work() {
        System.out.println("The dining room worker " + this.name + " is working.");
    }

    @Override
    public void rest() {
        System.out.println("The dining room worker " + this.name + " goes to rest.");
    }

    @Override
    public void feedBack() {
        System.out.println("The dining room worker " + this.name + " feed back things to the dining room manager");
        this.department.getManager().receiveFeedBack();
    }
}
