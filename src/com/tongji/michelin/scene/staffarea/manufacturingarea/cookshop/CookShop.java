package com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop;

import com.tongji.michelin.machine.processmachine.productmachine.ProductMachine;
import com.tongji.michelin.person.GeneralManager;
import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.person.staff.worker.utilityworker.UtilityWorker;
import com.tongji.michelin.scene.staffarea.manufacturingarea.ManufacturingArea;

/**
 * @author Y.C.Young Yuan.Cai
 * @project chocolateFactory
 * @classname Workshop
 * @description Workshop where the production is produced
 * @date 2020/11/9 20:05
 */
public class CookShop extends ManufacturingArea {

    public ProductMachine productMachine;

    public CookShop() {
        this("Cookshop", 10000, 100);
    }

    public CookShop(String location, double cost, double area) {
        super(location, cost, area, Manager.getCookShopManager());
        Manager.getCookShopManager().addDepartment(this);
        GeneralManager.getInstance().addManager(Manager.getCookShopManager());
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return "kitchen";
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
     * produce dinner
     */
    public void produceDinner() {

    }

    /**
     * produce product 2 of the production family: dessert
     */
    public void produceDessert() {

    }


}
