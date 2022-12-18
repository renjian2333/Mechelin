package com.tongji.michelin.scene.staffarea;

import com.tongji.michelin.person.GeneralManager;
import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.person.staff.worker.utilityworker.UtilityWorker;
import com.tongji.michelin.scene.SceneNameConst;

/**
 * @classname DiningRoom
 * @description Used for staffs to have breakfast, lunch or supper.
 */
public class DiningRoom extends StaffArea {


    public DiningRoom() {
        this("Dining room", 10000, 100);
    }

    /**
     * constructor of the DiningRoom with manager specified
     */
    public DiningRoom(String location, double cost, double area) {
        super(location, cost, area, Manager.getDiningRoomManager());
        Manager.getDiningRoomManager().addDepartment(this);
        GeneralManager.getInstance().addManager(Manager.getDiningRoomManager());
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return SceneNameConst.DINING_ROOM;
    }

    /**
     * maintain the devices in the dining room
     */
    public void getDevicesMaintained() {
        System.out.println("The tables and cookers have been maintained.");
    }

    /**
     * Visitor Pattern: accept a utility worker to maintenance the scene
     *
     * @param worker the utility worker
     */
    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }

}
