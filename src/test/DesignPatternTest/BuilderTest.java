package test.DesignPatternTest;

import com.tongji.michelin.machine.processmachine.productmachine.westerndishmachine.WesternDishController;
import com.tongji.michelin.machine.processmachine.productmachine.westerndishmachine.MeatWesternDishMachine;
import com.tongji.michelin.machine.processmachine.productmachine.westerndishmachine.VegetableWesternDishMachine;

import java.util.Random;
import java.util.Scanner;


/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname BuilderTest
 * @description Test for Design Pattern --- Builder
 * @date 2020/11/24 0:37
 */
public class BuilderTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Builder] Test ------------------------------------");
        System.out.println("");
        System.out.println("MilkChocController : startProduce() : Let the specific MilkChocMachine produce milk chocolate with a specific composition");
        System.out.println("MilkChocController : getMilkChocolate() : Get the milk chocolate produced");
        System.out.println("");

        System.out.println("Create a new MilkChocMachine producing milk chocolate in normal flavor and give control of it to a controller...");
        WesternDishController normalWesternDishController =new WesternDishController(new MeatWesternDishMachine());
        System.out.println("Create a new MilkChocMachine producing milk chocolate in thick flavor and give control of it to a controller...");
        WesternDishController thickWesternDishController =new WesternDishController(new VegetableWesternDishMachine());

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
                    System.out.println("Let normalMilkChocMachine start producing...");
                    normalWesternDishController.startProduce();
                    System.out.println("Let thickMilkChocMachine start producing...");
                    thickWesternDishController.startProduce();
                    break;
                }
                case 2: {
                    normalWesternDishController.westernDishMachine.fix();
                    thickWesternDishController.westernDishMachine.fix();
                    break;
                }
                case 3: {
                    Random rand = new Random();
                    int num = rand.nextInt(1000);
                    String number=String.valueOf(num);
                    normalWesternDishController.westernDishMachine =new MeatWesternDishMachine(number);
                    String name = normalWesternDishController.westernDishMachine.getMachineID();
                    System.out.println("Of the normalMilkChocController, machine " + name + " has been set to produce.\n");
                    normalWesternDishController.westernDishMachine.setAimProcessNum(100);

                    num = rand.nextInt(1000);
                    number=String.valueOf(num);
                    thickWesternDishController.westernDishMachine =new VegetableWesternDishMachine(number);
                    name =  thickWesternDishController.westernDishMachine.getMachineID();
                    System.out.println("Of the thickMilkChocController, machine " + name + " has been set to produce.\n");
                    thickWesternDishController.westernDishMachine.setAimProcessNum(100);
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}