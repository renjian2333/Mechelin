package com.tongji.michelin.person.staff;

import com.tongji.michelin.factory.support.WorkerAddingController;
import com.tongji.michelin.person.GeneralManager;
import com.tongji.michelin.person.filterchain.message.Message;
import com.tongji.michelin.person.staff.worker.Worker;
import com.tongji.michelin.scene.Scene;
import com.tongji.michelin.scene.staffarea.StaffArea;

import java.util.ArrayList;

/**
 * @classname Manager
 * @description A manager is responsible for one department.
 */
public class Manager extends Staff {

    public String identity = "manager";

    private ArrayList<StaffArea> departmentList;

    private static Manager diningRoomManager;

    private static Manager officeManager;

    private static Manager cookShopManager;

    private static Manager warehouseManager;


    protected Manager(String name, int age, Sex sex, int salary) {
        super(name, age, sex, salary, null);
        departmentList = new ArrayList<StaffArea>();

        diningRoomManager = null;
        officeManager = null;
        cookShopManager = null;
        warehouseManager = null;
    }

    /**
     * get diningRoom's manager which is single!!
     *
     * @return Manager
     */
    public static Manager getDiningRoomManager() {
        if (diningRoomManager == null) {
            diningRoomManager = new Manager("diningRoomManager", 25, Sex.FEMALE, 500);
        }
        System.out.println("Here is our dining room manager.");
        return diningRoomManager;
    }

    /**
     * get office's manager which is single!!
     *
     * @return Manager
     */
    public static Manager getOfficeManager() {
        if (officeManager == null) {
            officeManager = new Manager("officeManager", 28, Sex.FEMALE, 700);
        }
        System.out.println("Here is our office manager.");
        return officeManager;
    }

    /**
     * return the work shop's manager, which is single!!
     *
     * @return Manager
     */
    public static Manager getCookShopManager() {
        if (cookShopManager == null) {
            cookShopManager = new Manager("cookShopManager", 30, Sex.FEMALE, 800);
        }
        System.out.println("Here is our cookShop manager.");
        return cookShopManager;
    }

    /**
     * return the warehouse's manager which is single!!
     *
     * @return Manager
     */
    public static Manager getWarehouseManager() {
        if (warehouseManager == null) {
            warehouseManager = new Manager("warehouseManager", 28, Sex.MALE, 500);
        }
        System.out.println("Here is our warehouse manager.");
        return warehouseManager;
    }

    /**
     * @param joinStr the joining string
     * @return the department list name
     */
    public String getDepartmentListName(String joinStr) {
        ArrayList<String> strList = new ArrayList<String>();
        for (Scene obj : departmentList) {
            strList.add(obj.toString());
        }
        return String.join(joinStr, strList);
    }

    public String getDepartmentListName() {
        return getDepartmentListName(", ");
    }

    /**
     * add department to the departmentList;
     */
    public void addDepartment(StaffArea department) {
        this.departmentList.add(department);
    }

    /**
     * display information of the staff
     */
    @Override
    public void display() {
        System.out.printf("%-10s%-20s%-5d%-10s%s%n", id, name, age, sex, getDepartmentListName());
    }

    /**
     * Manager can hire workers for his/her department.
     *
     * @param name   name of the new worker
     * @param sex    sex of the new worker
     * @param age    age of the new worker
     * @param salary salary of the new worker
     */
    public void hireWorker(String name, Sex sex, int age, int salary, StaffArea staffArea) {
        if (this.departmentList.contains(staffArea)) {
            WorkerAddingController.addWorkerToScene(name, age, sex, salary, staffArea);
        }
        else {
            System.out.println("The manager does not match the staff area.");
        }
    }

    /**
     * Manager can fire workers for his/her department.
     *
     * @param worker the instance of the worker to be fired
     * @return whether the action of fire is successful, the manager can only fire the workers in his/her department.
     */
    public boolean fireWorker(Worker worker) {
        for (StaffArea department : this.departmentList) {
            if (department == worker.getDepartment()) {
                /* remove a worker from the worker list */
                department.removeWorker(worker);
                return true;
            }
        }
        System.out.println("The worker is not responsible to the manager.");
        return false;
    }

    /**
     * Dispatch the work got from general manager to each department he/she is managing.
     */
    public void dispatchTask() {
        System.out.println("Received work from the general manager.");
        for (StaffArea staffArea : this.departmentList) {//each department (one manager may manges several same type departments.
            ArrayList<Worker> workers = staffArea.getWorkerList();
            if (workers.isEmpty()) {
                System.out.println("Warning!! Here's no worker in this scene.");
            } else {
                for (Worker worker : workers) {
                    System.out.println("dispatch task to " + worker.getName());
                    worker.work();
                }
            }
        }
    }

    /**
     * Managers can move to anywhere.
     *
     * @param dest destination
     */
    @Override
    public void moveTo(Scene dest) {
        this.location = dest;
        System.out.println("The manager " + this.name + "moves to " + dest.toString());
    }

    /**
     * set the initial asset of the manager
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 100000;
    }

    @Override
    public String toString() {
        return "class Manager extends Staff";
    }

    /**
     * receive feedback from workers
     */
    public void receiveFeedBack() {
        System.out.println(this.name + " received feed back.");
        reportToGeneralManager();
    }

    /**
     * send feedback to the general manager
     */
    private void reportToGeneralManager() {
        System.out.println(this.name + " report feed back things to the general manager.");
        GeneralManager.getInstance().receiveFeedBack();
    }

    /**
     * This method is used to process messages.
     * If you do not agree to the request,
     * it will return false. If you agree, it will be submitted to the next level for approval.
     * If you are the last level, you will return true.
     *
     * @param requestMessage：sendMessage
     * @return Processing results
     */
    @Override
    public boolean HandleRequest(Message requestMessage) {
        System.out.println(this.identity + " " + this.name + " is handling request.");
        if (requestMessage.getMessageInfo().charAt(0) == 'M') {
            System.out.println(this.identity + " " + this.name + " rejects the request.");
            return false;
        }
        System.out.println(this.identity + " " + this.name + " approves the request.");
        if (successor != null) {
            return successor.HandleRequest(requestMessage);
        } else {
            System.out.println("The request is eventually approved. The content of the message is: " + requestMessage.getMessageInfo());
            return true;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Manager)) {
            return false;
        }
        Manager temp = (Manager) obj;
        return this.name.equals(temp.name);
    }


    /**
     * dispatch menu to order machines
     */
    public void dispatchMenu() {
//        if (managerList.isEmpty()) {
//            System.out.println("Please add manager to each scene first!!");
//        }
//        for (Manager manager : managerList) {
//            System.out.println("Dispatch work to " + manager.name);
//            manager.dispatchTask();
//        }
    }
    public void receiveDinner() {
        System.out.println("The cook received the order and start to prepare.");
    }
}
