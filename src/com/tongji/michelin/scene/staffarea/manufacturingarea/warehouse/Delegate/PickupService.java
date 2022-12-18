package com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Delegate;

import com.tongji.michelin.rawmaterial.RawMaterial;
import com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Warehouse;

/**
 * @classname PickupService
 * @description a kind of warehouse service that help get material from warehouse
 */
public class PickupService implements WarehouseService {

    @Override
    public void doProcessing(Warehouse warehouse, RawMaterial rawMaterial) {
        warehouse.useMaterial(rawMaterial.toString(), 1.0);
        System.out.println("Finish pickup service for " + rawMaterial.toString());
    }
}
