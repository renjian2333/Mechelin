package com.tongji.michelin.person;


import com.tongji.michelin.scene.EatingPlace;

public class CustomerGroup{
    protected int customerNum;

    protected EatingPlace eatingPlace;

    public CustomerGroup(int num){
        this.customerNum=num;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public void order() {
        System.out.println("The customerGroup " +this.customerNum+ " has ordered.");
    }


    public void returnOrder() {
        System.out.println("The customerGroup " + this.customerNum + "feed back their order to the worker");
        this.eatingPlace.getOrderMachine().receiveOrder();
    }
}
