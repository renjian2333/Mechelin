package com.tongji.michelin.machine.centralcontrolcomputer;

import com.tongji.michelin.person.CustomerGroup;
import com.tongji.michelin.person.GeneralManager;
import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.person.staff.worker.Worker;
import com.tongji.michelin.scene.EatingPlace;
import com.tongji.michelin.scene.staffarea.StaffArea;

import java.util.ArrayList;

public class OrderMachine {
    /**
     * Dispatch the order to the customer.
     */
    protected EatingPlace eatingPlace=new EatingPlace("OrderMachine A");

    public void dispatchOrder() {
        System.out.println("Received menu from workers.");
        ArrayList<CustomerGroup> customers = eatingPlace.getCustomerGroups();
        if (customers.isEmpty()) {
            System.out.println("Warning!! Here's no customer in this scene.");
        } else {
            for (CustomerGroup customer : customers) {
                System.out.println("dispatch menu to " + customer.getCustomerNum());
                customer.order();
            }
        }
    }

    /**
     * receive orders from customer
     */
    public void receiveOrder() {
        System.out.println(this.eatingPlace.getCode() + " received feed back.");
        reportToWorker();
    }

    /**
     * send feedback to the worker
     */
    private void reportToWorker() {
        System.out.println(this.eatingPlace.getCode() + " report feed back things to the worker.");
        Manager.getCookShopManager().receiveDinner();
    }


}
