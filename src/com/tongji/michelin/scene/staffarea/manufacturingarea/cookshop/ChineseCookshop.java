package com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop;

import com.tongji.michelin.machine.processmachine.productmachine.BasicProductMachine;
import com.tongji.michelin.product.dinner.KungPaoChicken;
import com.tongji.michelin.product.dessert.MatchaIceCream;
import com.tongji.michelin.scene.SceneNameConst;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname BlackWorkshop
 * @description This workshop produces dark chocolate and cat shaped cookies.
 * @date 2020/11/14 1:05
 */
public class ChineseCookshop extends CookShop {
    public ChineseCookshop() {
        super();
        productMachine = new BasicProductMachine("PR", "0324");
        String name = productMachine.getMachineID();
        System.out.println("In the ChineseCookshop, machine " + name + " has been set to produce.\n");
        productMachine.setAimProcessNum(250);
    }

    public ChineseCookshop(String location, double cost, double area) {
        super(location, cost, area);
        productMachine = new BasicProductMachine("PR", "0324");
        productMachine.setAimProcessNum(250);
    }

    public ChineseCookshop(String location, double cost, double area, String machineType, String machineNum, int aimProcess) {
        super(location, cost, area);
        productMachine = new BasicProductMachine(machineType, machineNum);
        productMachine.setAimProcessNum(aimProcess);
    }

    @Override
    public void produceDinner() {
        int outNum = productMachine.run(new KungPaoChicken());
        if (outNum == 0) {
            System.out.println("Failing producing chinese dinner!\n");
        } else {
            System.out.println("Successfully producing " + outNum + " chinese dinner!\n");
        }
    }

    @Override
    public void produceDessert() {
        int outNum = productMachine.run(new MatchaIceCream(MatchaIceCream.Shape.CAT));
        if (outNum == 0) {
            System.out.println("Failing producing chinese dessert!\n");
        } else {
            System.out.println("Successfully producing " + outNum + " chinese dessert!\n");
        }
    }

    @Override
    public String toString() {
        return SceneNameConst.CHINESE_COOKSHOP;
    }
}
