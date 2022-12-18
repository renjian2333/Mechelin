package com.tongji.michelin.scene.staffarea;

import com.tongji.michelin.person.GeneralManager;
import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.person.staff.worker.utilityworker.UtilityWorker;
import com.tongji.michelin.scene.SceneNameConst;


/**
 * @classname Office
 * @description As One kind of staff area, it represents office building.
 */
public class Office extends StaffArea {


    public Office() {
        this("Default Office", 100, 100);
    }

    /**
     * constructor of the Office with no manager specified
     */
    public Office(String location, double cost, double area) {
        super(location, cost, area, Manager.getOfficeManager());
        Manager.getOfficeManager().addDepartment(this);
        GeneralManager.getInstance().addManager(Manager.getOfficeManager());
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

    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return SceneNameConst.OFFICE;
    }
}
