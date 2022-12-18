package com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Delegate;

import com.tongji.michelin.rawmaterial.RawMaterial;

/**
 * @classname WarehouseClient
 * @description the presentation layer
 * Client of a warehouse, users can access service of warehouse through this client
 */
public class WarehouseClient {

    /**
     * the warehouse delegate
     */
    WarehouseDelegate warehouseDelegate;

    public WarehouseClient(WarehouseDelegate warehouseDelegate) {
        this.warehouseDelegate = warehouseDelegate;
        // showServiceList();
    }

    /**
     * By invoking this method, service of warehouse will be applied.
     * You can set the type of service by invoking
     * -> warehouseDelegate.setServiceType()
     *
     * @param rawMaterial every service is linked to some material
     */
    public void doTask(RawMaterial rawMaterial) {
        warehouseDelegate.doTask(rawMaterial);
    }

    public static void showServiceList() {
        System.out.println("");
        System.out.println("----Warehouse Service List----");
        System.out.println("**  1. pickup               **");
        System.out.println("**  2. storage              **");
        System.out.println("");
    }
}
