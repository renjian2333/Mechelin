package com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Delegate;

import com.tongji.michelin.rawmaterial.RawMaterial;
import com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Warehouse;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname StorageService
 * @description a kind of warehouse service that help store material in warehouse
 * @date 2020/11/17 21:13
 */
public class StorageService implements WarehouseService {

    @Override
    public void doProcessing(Warehouse warehouse, RawMaterial rawMaterial) {
        warehouse.addMaterial(rawMaterial.toString(), 1.0);
        System.out.println("Finish storage service for " + rawMaterial.toString());
    }
}
