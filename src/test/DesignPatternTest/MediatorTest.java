package test.DesignPatternTest;

import com.tongji.michelin.machine.centralcontrolcomputer.OrderMachine;
import com.tongji.michelin.person.CustomerGroup;
import com.tongji.michelin.person.Person;
import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.scene.staffarea.Office;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.CookShop;

import java.util.Scanner;

/**
 * @author zqr
 * @classname MediatorTest
 * @description MediatorTest
 */
public class MediatorTest {

    public static void main(String[] args) {
//        System.out.println("------------------------------------ [Mediator] Test ------------------------------------");
//        System.out.println("Worker : getInstance() : Get the instance of cookShop worker"+
//                " and create an instance if there's none,");
//        System.out.println("Worker : getInstance() : Get the only instance of the general manager " +
//                "and create an instance if there's none,");
//        System.out.println("Manager : getCookShopManager() : Get cookShop's manager which is single.");

        System.out.println("");
        System.out.println("*******************                        Mediator Test                           *******************");
        System.out.println("*** 1. Order machine dispatch the menu that cookShop manager dispatch to him to the customers      ***");
        System.out.println("*** 2. Order machine send order received from customers to the cookshop  manager                   ***");
        System.out.println("***                                                                                                ***");
        System.out.println("******************************************************************************************************");
        System.out.println("");
        OrderMachine orderMachine=new OrderMachine();
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
//                    cookShopManager.dispatchTask();
                    orderMachine.dispatchOrder();
                    break;
                }
                case 2: {
//                    cookShopManager.receiveFeedBack();
                    orderMachine.receiveOrder();
                    break;
                }

                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);


//        System.out.println("");
//        System.out.println("Worker : getInstance() : Get the only instance of the general manager " +
//                "and create an instance if there's none,");
//        System.out.println("Manager : getOfficeManager() : Get office's manager which is single.");
//        System.out.println("Manager : hireWorker() : Add workers to a specific department.");
//        System.out.println("Manager : dispatchTask() : Manager dispatch the task that general manager dispatch to him to the office workers.");
//        System.out.println("");
//
//        System.out.println("First, we need to create an office... ");
////      Office office = new Office();
//        CookShop cookShop=new CookShop();
//        System.out.println("Next, we should get the instance of the office manager...");
//        Manager cookShopManager = Manager.getCookShopManager();
//
//        System.out.println("Then, office manager should hired some office workers... ");
//        cookShopManager.hireWorker("worker1", Person.Sex.MALE, 18, 10, cookShop);
//        cookShopManager.hireWorker("worker2", Person.Sex.FEMALE, 22, 10, cookShop);
//        cookShopManager.hireWorker("worker3", Person.Sex.MALE, 20, 10, cookShop);
//
//        System.out.println("");
//        System.out.println("*******************                        Mediator Test                           *******************");
//        System.out.println("*** 1. Office manager dispatch the task that general manager dispatch to him to the office workers ***");
//        System.out.println("*** 2. Office manager send feedback received from workers to the general manager                   ***");
//        System.out.println("***                                                                                                ***");
//        System.out.println("******************************************************************************************************");
//        System.out.println("");

    }

}
