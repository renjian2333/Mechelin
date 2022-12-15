package test.DesignPatternTest;

import com.tongji.michelin.machine.processmachine.productmachine.milkchocmachine.WesternDishController;
import com.tongji.michelin.machine.processmachine.productmachine.milkchocmachine.MeatWesternDishMachine;
import com.tongji.michelin.machine.processmachine.productmachine.milkchocmachine.VegetableWesternDishMachine;
import com.tongji.michelin.product.dinner.WesternDish;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname ValueObjectTest
 * @description Test for Design Pattern --- Value Object
 * @date 2020/11/24 23:02
 */
public class ValueObjectTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Value Object] Test ------------------------------------");
        System.out.println("");
        System.out.println("MilkChocolate : equals(MilkChocolate milkChocolate) : Determine if two milk chocolate object values are equal");
        System.out.println("");

        System.out.println("Create a new MilkChocMachine producing milk chocolate in normal flavor and give control of it to a controller...");
        WesternDishController normalWesternDishController = new WesternDishController(new MeatWesternDishMachine());
        System.out.println("Let normalMilkChocMachine start producing...");
        normalWesternDishController.startProduce();
        System.out.println("Get product1 ...");
        WesternDish westernDish1 = normalWesternDishController.getWesternDish();
        System.out.println("MilkChocolate product1 is in normal flavor...");
        WesternDish westernDish2 = null;

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.println("******************************** TIPS **********************************");
            System.out.println("***        We have create a milk chocolate in normal flavor!         ***");
            System.out.println("***                                                                  ***");
            System.out.println("***       1. Input 1 to test if two products are equal in value      ***");
            System.out.println("*** 2. Input 2 to create a milk chocolate(product2) in normal flavor ***");
            System.out.println("*** 3. Input 3 to create a milk chocolate(product2) in thick flavor  ***");
            System.out.println("***                      4. Input 0 to exit                          ***");
            System.out.println("************************************************************************");
            System.out.println("");

            System.out.println("");
            System.out.print("Enter the command [0 to quit]:");
            op = input.nextInt();
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    if (westernDish2 == null) {
                        System.out.println("Please create product2 first!");
                        break;
                    }
                    if (westernDish1.equals(westernDish2))
                        System.out.println("The two milk chocolate products are equal in value.");
                    else
                        System.out.println("The two milk chocolate products are NOT equal in value!");
                    break;
                }
                case 2: {
                    Random rand = new Random();
                    int num = rand.nextInt(1000);
                    String number = String.valueOf(num);
                    normalWesternDishController.westernDishMachine = new MeatWesternDishMachine(number);
                    String name = normalWesternDishController.westernDishMachine.getMachineID();
                    System.out.println("Of the normalMilkChocController, machine " + name + " has been set to produce.\n");
                    normalWesternDishController.westernDishMachine.setAimProcessNum(100);
                    System.out.println("Let normalMilkChocMachine start producing...");
                    normalWesternDishController.startProduce();
                    System.out.println("Get product2 ...");
                    westernDish2 = normalWesternDishController.getWesternDish();
                    System.out.println("MilkChocolate product2 is in normal flavor...");
                    break;
                }
                case 3: {
                    System.out.println("Create a new MilkChocMachine producing milk chocolate in thick flavor and give control of it to a controller...");
                    WesternDishController thickWesternDishController = new WesternDishController(new VegetableWesternDishMachine());
                    System.out.println("Let thickMilkChocMachine start producing...");
                    thickWesternDishController.startProduce();
                    System.out.println("Get product2 ...");
                    westernDish2 = thickWesternDishController.getWesternDish();
                    System.out.println("MilkChocolate product2 is in thick flavor...");
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}