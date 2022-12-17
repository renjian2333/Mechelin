package test.DesignPatternTest;

import com.tongji.michelin.person.Person;
import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.scene.staffarea.DiningRoom;
import com.tongji.michelin.scene.staffarea.Office;
import com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Warehouse;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.ChineseCookshop;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.WesternCookshop;

import java.util.Scanner;

/**
 * @author Y.C.Young, Zeus Lee
 * @project chocolateFactory
 * @classname IOCPatternTest
 * @description By passing different staffareas, we create different workers in our workeraddingcontroller
 * and inject them into our staffarea class to realize our IOC (dependency flipping) function
 * @date 2020/11/22 22:07
 */
public class IOCTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [IOC] Test ------------------------------------");

        System.out.println("");
        System.out.println("WorkerAddingController : addWorkerToScene(): void : " +
                "By passing different staffareas, our work is generated internally and then returned.\n" +
                "\n");
        System.out.println("");

        System.out.println("");
        System.out.println("****************************** IOC Test *******************************");
        System.out.println("***                         1. Init Office                          ***");
        System.out.println("***                         2. Init DiningRoom                      ***");
        System.out.println("***                         3. Init Warehouse                       ***");
        System.out.println("***                         4. Init ChineseCookshop                    ***");
        System.out.println("***                         5. Init WestenCookShop                   ***");
        System.out.println("***                                                                 ***");
        System.out.println("***                                                                 ***");
        System.out.println("***You can select different scenarios, and the workers in the       ***");
        System.out.println("***scene will be filled automatically                               ***");
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
                    System.out.println("IOC Pattern: creating office Walker will implicitly create office worker：");
                    Office office = new Office();
                    Manager.getOfficeManager().hireWorker("Tom",  Person.Sex.MALE, 18, 5000, office);
                    office.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("IOC Pattern: creating office DiningRoom will implicitly create DinningRoomWorker：");
                    DiningRoom diningRoom = new DiningRoom();
                    Manager.getDiningRoomManager().hireWorker("Lisa", Person.Sex.FEMALE, 20, 6000, diningRoom);
                    diningRoom.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("IOC Pattern: creating warehouse will implicitly create WarehouseWorker：");
                    Warehouse warehouse = new Warehouse();
                    Manager.getWarehouseManager().hireWorker("mark",  Person.Sex.FEMALE, 22, 7000, warehouse);
                    warehouse.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("IOC Pattern: creating ChineseCookshop will implicitly create ChineseCookshopWorker：");
                    ChineseCookshop chineseCookshop = new ChineseCookshop();
                    Manager.getWorkShopManager().hireWorker("mark",  Person.Sex.MALE, 22, 7000, chineseCookshop);
                    chineseCookshop.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 5: {
                    System.out.println("IOC Pattern: creating WesternCookshop will implicitly create WesternCookWorker：");
                    WesternCookshop westernCookShop = new WesternCookshop();
                    Manager.getWorkShopManager().hireWorker("mark", Person.Sex.FEMALE, 22,  7000, westernCookShop);
                    westernCookShop.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }

}