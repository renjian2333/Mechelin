package com.tongji.michelin.factory;

import com.tongji.michelin.person.Person;
import com.tongji.michelin.person.staff.worker.utilityworker.Cleaner;
import com.tongji.michelin.person.staff.worker.utilityworker.MaintenanceWorker;
import com.tongji.michelin.scene.GarbageStation;
import com.tongji.michelin.scene.Scene;
import com.tongji.michelin.scene.SceneStructure;
import com.tongji.michelin.scene.decorator.Flat;
import com.tongji.michelin.scene.decorator.Villa;
import com.tongji.michelin.scene.publicarea.ExhibitionRoom;
import com.tongji.michelin.scene.publicarea.BuffetRoom;
import com.tongji.michelin.scene.staffarea.DiningRoom;
import com.tongji.michelin.scene.staffarea.Office;
import com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Warehouse;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.ChineseCookshop;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.WesternCookshop;

/**
 * @classname CaoanRestaurant
 */
public class CaoanRestaurant {
    
    private static CaoanRestaurant instance = null;

    /**
     * scene structure containing all scenes in the restaurant
     */
    private SceneStructure scenes;

    /**
     * flag showing whether the restaurant is to clean
     */
    private boolean dirtyFlag = false;

    /**
     * flag showing whether the restaurant is to maintenance
     */
    private boolean agingFlag = false;

    /**
     * constructor of the restaurant
     */
    private CaoanRestaurant() {
        scenes = new SceneStructure();
        scenes.addScene(new ExhibitionRoom("", 5e5, 300.0, 100));
        scenes.addScene(new BuffetRoom("", 2e5, 400.0, 50));
        scenes.addScene(new Warehouse("", 2e6, 2000.0));
        scenes.addScene(new ChineseCookshop("", 2e6, 1500.0, "PR", "0324", 250));
        scenes.addScene(new WesternCookshop("", 2e6, 1200.0, "PR", "1825", 250));
        scenes.addScene(new DiningRoom("", 3e5, 500.0));
        scenes.addScene(new Office("", 3e5, 800.0));
        scenes.addScene(new GarbageStation("", 2e5, 100.0, 1000));
        scenes.addScene(new Flat("", 2e5, 500.0));
        scenes.addScene(new Villa("", 1e6, 350.0));
    }

    /**
     * using Singleton pattern to get or create the only one instance of the class
     *
     * @return the only one instance of the restaurant class
     */
    public static CaoanRestaurant getCaoanRestaurant() {
        if (instance == null) {
            instance = new CaoanRestaurant();
        }
        return instance;
    }

    /**
     * add a scene to the restaurant
     *
     * @param scene the scene to be added to the restaurant
     */
    public void addScene(Scene scene) {
        scenes.addScene(scene);
    }

    /**
     * set the dirty flag true
     */
    public void setDirtyTrue() {
        this.dirtyFlag = true;
    }

    /**
     * get the value of dirty flag
     *
     * @return the value of dirty flag
     */
    public boolean getDirtyFlag() {
        return this.dirtyFlag;
    }

    /**
     * set the aging flag true
     */
    public void setAgingTrue() {
        this.agingFlag = true;
    }

    /**
     * get the value of aging flag
     *
     * @return the value of aging flag
     */
    public boolean getAgingFlag() {
        return this.agingFlag;
    }

    /**
     * Periodically clean the scenes
     *
     * @param c cleaner object
     */
    public void clean(Cleaner c) {
        scenes.accept(c);
    }

    /**
     * interface of clean operation for TimeSystem class
     */
    public void doClean() {

        // hire a temporary cleaner
        Cleaner tempCleaner = new Cleaner("Temp Cleaner", 20, Person.Sex.MALE, 500);

        clean(tempCleaner);
        dirtyFlag = false;

    }

    /**
     * Periodically maintain the scenes
     *
     * @param m maintenance object
     */
    public void maintain(MaintenanceWorker m) {
        scenes.accept(m);
    }

    /**
     * interface of maintenance operation for TimeSystem class
     */
    public void doMaintenance() {

        // hire a temporary maintenance worker
        MaintenanceWorker tempWorker = new MaintenanceWorker("temp maintenance worker", 20, Person.Sex.MALE, 500);

        maintain(tempWorker);
        agingFlag = false;

    }

}
