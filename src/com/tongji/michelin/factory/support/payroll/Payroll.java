package com.tongji.michelin.factory.support.payroll;

import com.tongji.michelin.person.staff.Staff;
import com.tongji.michelin.person.staff.worker.Worker;
import com.tongji.michelin.scene.staffarea.StaffArea;

import java.util.ArrayList;

/**
 * @classname Payroll
 * @description abstract class for payroll (Using Design Pattern Observer)
 */
public abstract class Payroll {

    protected ArrayList<Staff> staffList;

    protected Payroll() {
        staffList = new ArrayList<Staff>();
    }

    /**
     * add a staff into the payroll
     * @param staff the added staff
     */
    public void addStaff(Staff staff) {
        staffList.add(staff);
        System.out.println("Add " + staff.getName() + " successfully.");
    }

    /**
     * add all staffs in the staff area into the payroll
     * @param staffArea staff area to added
     */
    public void addAllStaffs(StaffArea staffArea) {
        ArrayList<Worker> list = staffArea.getWorkerList();
        staffList.addAll(list);
        System.out.println("Add all staffs in " + staffArea.toString() + " successfully.");
    }

    /**
     * remove a staff from the payroll
     * @param staff the removed staff
     */
    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }

    public void removeStaff(String name) {
        if (staffList.removeIf(worker -> worker.getName().equals(name))) {
            System.out.println("Remove " + name + " successfully.");
        } else {
            System.out.println(name + " is not in the staff list of this payroll.");
        }

    }

    /**
     * pay off for <a>all the staffs</a> in the staff list
     * implementation will be included in the concrete payoff class
     */
    public abstract void payOff();
}
