package test.DesignPatternTest;

import com.tongji.michelin.machine.processmachine.productmachine.extension.AugProductMachine;
import com.tongji.michelin.machine.processmachine.productmachine.BasicProductMachine;
import com.tongji.michelin.product.dinner.KungPaoChicken;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname ExtensionObjects
 * @description Test for Design Pattern --- Extension Objects
 * @date 2022/11/24 0:58
 */
public class ExtensionObjectsTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Extension Objects] Test ------------------------------------");
        System.out.println("");
        System.out.println("AugProductMachine : continueWork(workNum: int,  product: Product) : Let the specific WesternDishMachine produce WesternDish with a specific composition");
        System.out.println("AugProductMachine : fix() : Fix machine");
        System.out.println("");

        System.out.println("Create an product machine and then enhance it...");
        AugProductMachine augProductMachine=new AugProductMachine(new BasicProductMachine("PR","507"));

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.println("********************** TIPS **********************");
            System.out.println("***      1. Input 1 to start testing           ***");
            System.out.println("***      2. Input 2 to fix machine            ***");
            System.out.println("***      3. Input 3 to create new machine     ***");
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
                    System.out.print("Please enter the number of times the machine runs:");
                    int workNum = input.nextInt();
                    System.out.println("\nLet AugProductMachine run "+workNum+" times producing dish...\n");
                    augProductMachine.continueWork(workNum, new KungPaoChicken());
                    break;
                }
                case 2: {
                    augProductMachine.fix();
                    break;
                }
                case 3: {
                    Random rand = new Random();
                    int num = rand.nextInt(1000);
                    String number=String.valueOf(num);
                    augProductMachine=new AugProductMachine(new BasicProductMachine("PR",number));
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}