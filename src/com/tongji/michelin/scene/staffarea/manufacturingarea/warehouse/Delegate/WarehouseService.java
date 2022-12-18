package com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Delegate;

import com.tongji.michelin.rawmaterial.RawMaterial;
import com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Warehouse;

/**
 * @classname WarehouseService
 * @description interface of warehouse service
 */
public interface WarehouseService {

    public void doProcessing(Warehouse warehouse, RawMaterial rawMaterial);
}
