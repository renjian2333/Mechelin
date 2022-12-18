package com.tongji.michelin.scene;

import com.tongji.michelin.machine.centralcontrolcomputer.OrderMachine;
import com.tongji.michelin.person.CustomerGroup;
import com.tongji.michelin.person.GeneralManager;
import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.person.staff.worker.CookShopWorker;
import com.tongji.michelin.person.staff.worker.Worker;

import java.util.ArrayList;

public class EatingPlace {
    protected String code;
    protected OrderMachine orderMachine = null;
    protected Manager cookShopManager;
    /**
     * List of all workers in the area
     **/
    protected ArrayList<CustomerGroup> customerGroups= null;

    public String getCode() {
        return code;
    }

    public Manager getCookShopManager() {
        return cookShopManager;
    }

    public OrderMachine getOrderMachine() {
        return orderMachine;
    }

    public ArrayList<CustomerGroup> getCustomerGroups() {
        return customerGroups;
    }

    public EatingPlace(String name) {
        code=name;
        customerGroups = new ArrayList<CustomerGroup>();
        CustomerGroup customerGroupIns=new CustomerGroup(1);
        customerGroups.add(customerGroupIns);
//        orderMachine = new OrderMachine();
        cookShopManager= Manager.getCookShopManager();
    }
}
