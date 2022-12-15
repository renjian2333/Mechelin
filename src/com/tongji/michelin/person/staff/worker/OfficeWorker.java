package com.tongji.michelin.person.staff.worker;

import com.tongji.michelin.scene.staffarea.StaffArea;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname OfficeWorker
 * @description worker in the office
 * @date 2020/11/11 16:21
 */
public class OfficeWorker extends Worker {

    public OfficeWorker(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    public OfficeWorker(String name, int age, Sex sex, int salary) {
        super(name, age, sex, salary);
    }

    @Override
    public void work() {
        System.out.println("The office worker " + this.name + " is working.");
    }

    @Override
    public void rest() {
        System.out.println("The office worker " + this.name + " goes to rest.");
    }

    @Override
    public void feedBack() {
        System.out.println("The office worker " + this.name + " feed back things to the dining room manager");
        this.department.getManager().receiveFeedBack();
    }
}
