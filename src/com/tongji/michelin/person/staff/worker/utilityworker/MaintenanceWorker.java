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
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname FixWorker
 * @description workers checking safety risks of scenes and keeping scenes safe
 * @date 2020/11/18 16:48
 */
public class MaintenanceWorker extends Worker implements UtilityWorker {

    public MaintenanceWorker(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    public MaintenanceWorker(String name, int age, Sex sex, int salary) {
        super(name, age, sex, salary);
    }

    @Override
    public void work() {
        System.out.println("The maintenance worker " + this.name + "is working.");
    }

    @Override
    public void rest() {
        System.out.println("The maintenance worker " + this.name + "goes to rest.");
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

    }

    /**
     * implement methods defined in interface to maintain the public area
     *
     * @param s public area scene
     */
    @Override
    public void visit(PublicArea s) {
        s.getExhibitsMaintained();
    }

    /**
     * implement methods defined in interface to maintain the office
     *
     * @param s office scene
     */
    @Override
    public void visit(Office s) {

    }

    /**
     * implement methods defined in interface to maintain the manufacturing area
     *
     * @param s manufacturing area scene
     */
    @Override
    public void visit(ManufacturingArea s) {
        s.getAllMachinesMaintained();
    }

    /**
     * implement methods defined in interface to maintain the dining room
     *
     * @param s dining room scene
     */
    @Override
    public void visit(DiningRoom s) {
        s.getDevicesMaintained();
    }

    /**
     * implement methods defined in interface to maintain the residence
     *
     * @param s residence scene
     */
    @Override
    public void visit(Residence s) {

    }
}
