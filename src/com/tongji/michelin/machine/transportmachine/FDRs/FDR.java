package com.tongji.michelin.machine.transportmachine.FDRs;

import com.tongji.michelin.product.Product;

/**
 * @classname FDR
 * @description: This is basic function of FDR. (FDR means food-delivered robot, in Chinese means 送餐机器人)
 */
public interface FDR {

    int work(Product product);

    void setID(String ID);

    String getID();

    void setAimProcessNum(int aimProcessNum);

    /**
     * @description The method UAV differ from normal transport machine.
     */
    void navigate();

}
