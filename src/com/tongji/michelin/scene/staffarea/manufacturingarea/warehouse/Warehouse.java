package com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse;

import com.tongji.michelin.person.GeneralManager;
import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.person.staff.worker.utilityworker.UtilityWorker;
import com.tongji.michelin.scene.SceneNameConst;
import com.tongji.michelin.scene.staffarea.manufacturingarea.ManufacturingArea;

import java.util.HashMap;

/**
 * @classname Warehouse
 * @description Warehouse for storing raw material and production
 */
public class Warehouse extends ManufacturingArea {

    protected HashMap<String, Double> materialAmount;
    protected HashMap<String, Integer> productionAmount;

    public Warehouse(String location, double cost, double area) {
        super(location, cost, area, Manager.getWarehouseManager());
        Manager.getWarehouseManager().addDepartment(this);
        GeneralManager.getInstance().addManager(Manager.getWarehouseManager());
        materialAmount = new HashMap<String, Double>();
        productionAmount = new HashMap<String, Integer>();
    }


    public Warehouse() {
        this("Warehouse Location", 10000, 100);
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return SceneNameConst.WAREHOUSE;
    }


    /**
     * when other class needs to use material, the method will be invoked to modify amount of the material
     *
     * @param type   type of the material to be used (String)
     * @param amount amount of the material needed (Double)
     */
    public void useMaterial(String type, Double amount) {
        if (!materialAmount.containsKey(type)) {
            System.out.println("There is no such kind material");
        } else if (materialAmount.get(type) < amount) {
            System.out.println("Amount of the material is not enough");
        } else {
            materialAmount.put(type, materialAmount.get(type) - amount);
        }
    }

    /**
     * add the amount of material
     *
     * @param type   type of the material to be added (String)
     * @param amount amount of the material added (Double)
     */
    public void addMaterial(String type, Double amount) {
        if (materialAmount.containsKey(type)) {
            materialAmount.put(type, amount + materialAmount.get(type));
            System.out.println("Successfully add " + amount + " " + type + " in the warehouse.");
        } else {
            materialAmount.put(type, amount);
            System.out.println("Successfully add " + amount + " " + type + " in the warehouse.");
        }
    }

    /**
     * create a new kind of material in the warehouse
     *
     * @param kind new kind of material
     */
    public void createMaterialKind(String kind) {
        if (materialAmount.containsKey(kind)) {
            System.out.println("The kind exists.");
        } else {
            materialAmount.put(kind, 0.0);
        }
    }

    /**
     * get the amount of each kind of material
     *
     * @return the map shows the amount of each kind of material
     */
    public HashMap<String, Double> getMaterialList() {
        return new HashMap<String, Double>(materialAmount);
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
