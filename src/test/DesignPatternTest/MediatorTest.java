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

    }

}
