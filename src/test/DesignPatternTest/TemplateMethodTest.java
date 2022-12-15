package test.DesignPatternTest;

import com.tongji.michelin.machine.transportmachine.BigTruck;
import com.tongji.michelin.machine.transportmachine.SmallCar;
import com.tongji.michelin.machine.transportmachine.Van;
import com.tongji.michelin.product.dessert.MangoIceCream;

import java.util.Scanner;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname TemplateMethodTest
 * @description Test for Template Method
 * @date 2020/11/20 21:06
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Template Method] Test ------------------------------------");

        System.out.println("");
        System.out.println("TransportMachine : work(product: Product) : execute work of transporting, include loading," +
                " transporting and arriving.");
        System.out.println("TransportMachine : load(product: Product) : first step of work, loading a product.");
        System.out.println("TransportMachine : arrive(product: Product) : last step of work, loading a product.");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        System.out.println("We will use the transport machine to test the template method.");
        System.out.println("Suppose that we want to transport 50 chocolate cakes.");
        MangoIceCream cakes = new MangoIceCream(1);

        do {
            System.out.println("");
            System.out.println("************************* Template Method Test ************************");
            System.out.println("***                 To transport chocolate cakes                    ***");
            System.out.println("***                 1. Use a big truck                              ***");
            System.out.println("***                 2. Use a van                                    ***");
            System.out.println("***                 3. Use a small car                              ***");
            System.out.println("***                                                                 ***");
            System.out.println("***                 To carry people                                 ***");
            System.out.println("***                 4. Use a small car                              ***");
            System.out.println("***********************************************************************");

            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();


            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("\nUse a big truck to transport them.");
                    BigTruck bigTruck = new BigTruck("TR", "101");
                    bigTruck.setAimProcessNum(50);
                    bigTruck.work(cakes);
                    break;
                }
                case 2: {
                    System.out.println("\nUse a van to transport them.");
                    Van van = new Van("TR", "102");
                    van.setAimProcessNum(50);
                    van.work(cakes);
                    break;
                }
                case 3: {
                    System.out.println("\nUse a small car to transport them.");
                    SmallCar smallCar = new SmallCar("TR", "103");
                    smallCar.work(cakes);
                    break;
                }
                case 4: {
                    System.out.println("\nIt seems that small car can only take people. Let's try!");
                    SmallCar smallCar = new SmallCar("TR", "104");
                    smallCar.work(null);
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
