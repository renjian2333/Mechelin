package com.tongji.michelin.person.staff;


/**
 * @classname EmptyWorker
 * @description Empty Object Pattern: used when finding a staff who doesn't exist
 */
public class EmptyStaff extends Staff {
    public EmptyStaff() {
        super(null, -1, null, -1, null);
    }


    @Override
    protected void setInitialAsset() {
        this.asset = -1;
    }

    /**
     * input no staff found
     */
    @Override
    public void display() {
        System.out.println("No staff found.");
    }
}
