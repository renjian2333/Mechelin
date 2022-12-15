package com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Delegate;

import com.tongji.michelin.rawmaterial.RawMaterial;
import com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Warehouse;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname WarehouseService
 * @description interface of warehouse service
 * @date 2020/11/17 21:11
 */
public interface WarehouseService {

    public void doProcessing(Warehouse warehouse, RawMaterial rawMaterial);
}
