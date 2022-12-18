package com.tongji.michelin.machine.transportmachine.FDRs;

import com.tongji.michelin.machine.transportmachine.TransportMachine;
import com.tongji.michelin.product.Product;

/**
 * @classname Adapter
 * @description: Adapter Pattern to implement UAV's work function
 */
public class Adapter implements FDR {
    private TransportMachine adaptee;
    private String mID;

    public Adapter() {
    }

    public Adapter(TransportMachine adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int work(Product product) {
        this.navigate();
        adaptee.run(product);
        return 0;
    }

    @Override
    public void setID(String ID) {
        this.mID = ID;
    }

    @Override
    public String getID() {
        return this.mID;
    }


    @Override
    public void setAimProcessNum(int aimProcessNum) {
        adaptee.setAimProcessNum(aimProcessNum);
    }

    @Override
    public void navigate() {
        System.out.println("FDR " + this.mID + " is navigating to destination.\n");
    }


    public TransportMachine getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(TransportMachine adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String toString() {
        return "class Adapter implements UAV";
    }
}
