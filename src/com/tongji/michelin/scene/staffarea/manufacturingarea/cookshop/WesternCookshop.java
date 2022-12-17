package com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop;

import com.tongji.michelin.machine.processmachine.productmachine.BasicProductMachine;
import com.tongji.michelin.product.dessert.ChocolateIceCream;
import com.tongji.michelin.product.dinner.Steak;
import com.tongji.michelin.product.dessert.MatchaIceCream;
import com.tongji.michelin.scene.SceneNameConst;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname WhiteWorkshop
 * @description This workshop produces white chocolate and dog shaped cookies.
 * @date 2020/11/13 18:33
 */
public class WesternCookshop extends CookShop {
    public WesternCookshop() {
        super();
        productMachine = new BasicProductMachine("PR", "1825");
        String name = productMachine.getMachineID();
        System.out.println("In the WesternCookShop, machine " + name + " has been set to produce.\n");
        productMachine.setAimProcessNum(250);
    }

    public WesternCookshop(String location, double cost, double area) {
        super(location, cost, area);
        productMachine = new BasicProductMachine("PR", "1825");
        productMachine.setAimProcessNum(250);
    }

    public WesternCookshop(String location, double cost, double area, String machineType, String machineNum, int aimProcess) {
        super(location, cost, area);
        productMachine = new BasicProductMachine(machineType, machineNum);
        productMachine.setAimProcessNum(aimProcess);
    }

    @Override
    public void produceDinner() {
        int outNum = productMachine.run(new Steak());
        if (outNum == 0) {
            System.out.println("Failing producing western dinner!\n");
        } else {
            System.out.println("Successfully producing " + outNum + " western dinner!\n");
        }
    }

    @Override
    public void produceDessert() {
        int outNum = productMachine.run(new ChocolateIceCream());
        if (outNum == 0) {
            System.out.println("Failing producing western dessert!\n");
        } else {
            System.out.println("Successfully producing " + outNum + " western dessert!\n");
        }
    }

    @Override
    public String toString() {
        return SceneNameConst.WESTERN_COOKSHOP;
    }
}
