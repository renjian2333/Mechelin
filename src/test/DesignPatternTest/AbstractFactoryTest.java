package test.DesignPatternTest;
import com.tongji.michelin.machine.processmachine.productmachine.BasicProductMachine;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.ChineseCookshop;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.WesternCookshop;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.CookShop;

import java.util.Scanner;
import java.util.Random;

/**
 * @Author qxh
 * @Classname AbstractFactoryTest
 * @Description Test for Design Pattern --- Abstract Factory
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println("---------------------------- [Abstract Factory] Test --------------------------------");
        System.out.println("");
        System.out.println("Cookshop : produceDinner()");
        System.out.println("Cookshop : produceDessert()");
        System.out.println("");

        System.out.println("Create a new cook shop to cook western food");
        CookShop westernCookShop = new WesternCookshop();
        System.out.println("Create a new cook shop to cook Chinese food");
        CookShop chineseCookshop = new ChineseCookshop();

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.println("********************** TIPS **********************");
            System.out.println("***      1. Input 1 to start testing           ***");
            System.out.println("***      2. Input 2 to fix machines            ***");
            System.out.println("***      3. Input 3 to create new machines     ***");
            System.out.println("***      4. Input 0 to exit                    ***");
            System.out.println("**************************************************");
            System.out.println("");


            System.out.println("");
            System.out.print("Enter the command [0 to quit]:");
            op = input.nextInt();
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Let westernCookShop start producing western dinner...");
                    westernCookShop.produceDinner();
                    System.out.println("Let westernCookShop start producing western dessert...");
                    westernCookShop.produceDessert();
                    System.out.println("Let chineseCookshop start producing chinese dinner...");
                    chineseCookshop.produceDinner();
                    System.out.println("Let chineseCookshop start producing chinese dessert...");
                    chineseCookshop.produceDessert();
                    break;
                }
                case 2: {
                    westernCookShop.productMachine.fix();
                    chineseCookshop.productMachine.fix();
                    break;
                }
                case 3: {
                    Random rand = new Random();
                    int num = rand.nextInt(1000);
                    String number=String.valueOf(num);
                    westernCookShop.productMachine=new BasicProductMachine("PR", number);
                    String name = westernCookShop.productMachine.getMachineID();
                    System.out.println("In the WesternCookshop, machine " + name + " has been set to produce.\n");
                    westernCookShop.productMachine.setAimProcessNum(250);

                    num = rand.nextInt(1000);
                    number=String.valueOf(num);
                    chineseCookshop.productMachine=new BasicProductMachine("PR", number);
                    name = chineseCookshop.productMachine.getMachineID();
                    System.out.println("In the chineseCookshop, machine " + name + " has been set to produce.\n");
                    chineseCookshop.productMachine.setAimProcessNum(250);
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}