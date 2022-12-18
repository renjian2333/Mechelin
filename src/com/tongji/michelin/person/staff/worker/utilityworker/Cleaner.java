package com.tongji.michelin.person.staff.worker.utilityworker;

import com.tongji.michelin.person.staff.worker.Worker;
import com.tongji.michelin.scene.GarbageStation;
import com.tongji.michelin.scene.decorator.Residence;
import com.tongji.michelin.scene.publicarea.PublicArea;
import com.tongji.michelin.scene.staffarea.DiningRoom;
import com.tongji.michelin.scene.staffarea.Office;
import com.tongji.michelin.scene.staffarea.StaffArea;
import com.tongji.michelin.scene.staffarea.manufacturingarea.ManufacturingArea;

/**
 * @classname Cleaner
 * @description workers cleaning the scenes
 */
public class Cleaner extends Worker implements UtilityWorker {

    public Cleaner(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    public Cleaner(String name, int age, Sex sex, int salary) {
        super(name, age, sex, salary);
    }

    @Override
    public void work() {
        System.out.println("The cleaner " + this.name + "is working.");
    }

    @Override
    public void rest() {
        System.out.println("The cleaner " + this.name + "goes to rest.");
    }

    @Override
    public void feedBack() {

    }

    /**
     * implement methods defined in interface to maintain the garbage station
     *
     * @param s garbage station scene
     */
    @Override
    public void visit(GarbageStation s) {
        s.getCleanUp();
    }

    /**
     * implement methods defined in interface to maintain the public area
     *
     * @param s public area scene
     */
    @Override
    public void visit(PublicArea s) {
        s.getCleanUp();
    }

    /**
     * implement methods defined in interface to maintain the office
     *
     * @param s office scene
     */
    @Override
    public void visit(Office s) {
        s.getCleanUp();
    }

    /**
     * implement methods defined in interface to maintain the manufacturing area
     *
     * @param s manufacturing area scene
     */
    @Override
    public void visit(ManufacturingArea s) {
        s.getCleanUp();
    }

    /**
     * implement methods defined in interface to maintain the dining room
     *
     * @param s dining room scene
     */
    @Override
    public void visit(DiningRoom s) {
        s.getCleanUp();
    }

    /**
     * implement methods defined in interface to maintain the residence
     *
     * @param s residence scene
     */
    @Override
    public void visit(Residence s) {
        s.getCleanUp();
    }
}
