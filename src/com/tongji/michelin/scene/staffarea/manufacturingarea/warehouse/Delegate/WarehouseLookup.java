package com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Delegate;

/**
 * @classname WarehouseLookup
 * @description To look up a warehouse service
 */
public class WarehouseLookup {

    /**
     * @param serviceType the wanted service type
     * @return If found, return an object of the wanted service type
     * If not found, return null
     */
    public WarehouseService getWarehouseService(String serviceType) {

        if (serviceType.equalsIgnoreCase("pickup")) {
            return new PickupService();
        }
        if (serviceType.equalsIgnoreCase("storage")) {
            return new StorageService();
        }
        return null;
    }
}
