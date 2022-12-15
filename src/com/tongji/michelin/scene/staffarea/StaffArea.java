package com.tongji.michelin.scene.staffarea;

import com.tongji.michelin.person.GeneralManager;
import com.tongji.michelin.person.staff.EmptyStaff;
import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.person.staff.worker.utilityworker.UtilityWorker;
import com.tongji.michelin.person.staff.worker.Worker;
import com.tongji.michelin.scene.Scene;
import com.tongji.michelin.scene.SceneNameConst;
import com.tongji.michelin.scene.staffarea.WorkerIterator.Aggregate;
import com.tongji.michelin.scene.staffarea.WorkerIterator.Iterator;
import com.tongji.michelin.scene.staffarea.WorkerIterator.WorkerListIterator;

import java.util.ArrayList;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname StaffArea
 * @description Inherited from basic class scene, it represents scenes only open for staffs.
 * ConcreteAggregate of the Iterator.
 * @date 2020/11/9 19:44
 */
public abstract class StaffArea extends Scene implements Aggregate {

    /**
     * Manager of the staff area
     **/
    protected Manager manager;

    /**
     * List of all workers in the area
     **/
    protected ArrayList<Worker> workerList = null;


    public StaffArea() {
        super();
    }

    /**
     * Constructor of StaffArea with manager specified
     */
    public StaffArea(String location, double cost, double area, Manager newManager) {
        super(location, cost, area);
        workerList = new ArrayList<Worker>();
        manager = newManager;
        GeneralManager.getInstance().addManager(manager);
    }

    /**
     * get the manager of the area
     *
     * @return manager of the staff area
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * set the new manager of the staff area
     *
     * @param newManager new manager of the StaffArea
     */
    public void setManager(Manager newManager) {
        manager = newManager;
    }

    /**
     * add a given worker to the list
     *
     * @param workerObj worker object
     */
    public void addWorker(Worker workerObj) {
        if (!workerList.contains(workerObj)) {
            workerList.add(workerObj);
        } else {
            System.out.println("The worker is in the scene");
        }
    }

    /**
     * remove a worker from this staff area if the worker is in the list
     *
     * @param workerObj object of the worker to be removed
     */
    public void removeWorker(Worker workerObj) {
        if (workerList.contains(workerObj)) {
            workerList.remove(workerObj);
        } else {
            System.out.println("Worker object doesn't exist.");
        }
    }

    /**
     * find and remove a worker from the factory
     * @param name name of the worker to be removed
     */
    public void removeWorker(String name) {
        workerList.removeIf(worker -> worker.getName().equals(name));
        System.out.println("Worker object doesn't exist.");
    }

    /**
     * get the worker list
     *
     * @return the worker list of the staff area
     */
    public ArrayList<Worker> getWorkerList() {
        return workerList;
    }

    /**
     * display all staffs in the staff area
     */
    public void displayAllStaffs() {
        System.out.printf("%-10s%-20s%-5s%-10s%s%n", "Id", "Name", "Age", "Sex", "Department");
        manager.display();
        for (Worker obj : workerList) {
            obj.display();
        }
    }

    /**
     * find a staff by id and display information
     *
     * @param id id of the staff to be found
     */
    public void searchStaffById(String id) {
        if (manager.getId().equals(id)) {
            manager.display();
            return;
        }
        for (Worker obj : workerList) {
            if (obj.getId().equals(id)) {
                obj.display();
                return;
            }
        }
        (new EmptyStaff()).display();
    }

    /**
     * @return an Iterator that copies the protected WorkerList
     */
    @Override
    public Iterator getIterator() {
        return new WorkerListIterator(workerList);
    }

    /**
     * Visitor Pattern: accept a utility worker to maintain the scene
     *
     * @param worker the utility worker
     */
    public abstract void accept(UtilityWorker worker);

    @Override
    public String toString() {
        return SceneNameConst.STAFF_AREA;
    }

}
