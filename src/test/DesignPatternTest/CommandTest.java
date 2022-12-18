package test.DesignPatternTest;

import com.tongji.michelin.person.Person;
import com.tongji.michelin.person.staff.worker.Worker;
import com.tongji.michelin.person.staff.worker.CookShopWorker;

import java.util.Scanner;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname CommandTest
 * @description test for command pattern
 * @date 2020/11/21 21:32
 */
public class CommandTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Command] Test ------------------------------------");

        System.out.println("");
        System.out.println("Worker : produceDarkChocolate : Let the worker send a command to produce dark chocolate.");
        System.out.println("Product : producing : Transmit the command to a specific machine .");
        System.out.println("ProductMachine : process : Execute specific production process.");
        System.out.println("");

        System.out.println("Firstly, we need to create a worker.");
        Worker worker = new CookShopWorker("worker", 18, Person.Sex.MALE, 10);

        System.out.println("");
        System.out.println("*******************             Command Test        *******************");
        System.out.println("***                 1. produce some dark chocolate                  ***");
        System.out.println("***                 2. produce chocolate cake                       ***");
        System.out.println("***                 3. produce chocolate cookie                     ***");
        System.out.println("***                 4. produce chocolate ice cream                  ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    worker.produceDarkChocolate();
                    break;
                }
                case 2: {
                    worker.produceChocolateCake();
                    break;
                }
                case 3: {
                    worker.produceChocolateCookie();
                    break;
                }
                case 4: {
                    worker.produceChocolateIceCream();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
