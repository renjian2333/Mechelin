package test.DesignPatternTest;

import com.tongji.michelin.factory.CaoanRestaurant;
import com.tongji.michelin.factory.support.TimeSystem;

import java.util.Scanner;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname DirtyFlagTest
 * @description Test for dirty flag pattern
 * @date 2020/11/24 22:02
 */
public class DirtyFlagTest {

    public static void main(String[] args) {

        System.out.println("------------------------------------ Dirty Flag Test ------------------------------------");

        System.out.println("");
        System.out.println("TimeSystem : tick(): void : check the cleaning and aging condition of the factory every once in a while");
        System.out.println("PeriodicMaintenance : get/setDirty/AgingFlag(): boolean/void : get or set the cleaning and aging condition of the factory");
        System.out.println("");

        System.out.println("");
        System.out.println("***************************** Dirty Flag Test *************************");
        System.out.println("***                      1. start the simulation                    ***");
        System.out.println("***                      2. set the dirty flag true                 ***");
        System.out.println("***                      3. set the aging flag true                 ***");
        System.out.println("***                      0. quit the test                           ***");
        System.out.println("***                                                                 ***");
        System.out.println("***    Input the number and execute the corresponding operation.    ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        TimeSystem timeSystem = null;

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        while (flag) {
            op = input.nextInt();
            switch (op) {
                case 0:
                    flag = false;
                    if (timeSystem != null) {
                        timeSystem.stopTimeSystem();
                    }
                    break;
                case 1: {
                    if (timeSystem == null) {
                        CaoanRestaurant.getCharlieFactory();
                        timeSystem = new TimeSystem();
                        System.out.println("Now the timer starts.");
                    }
                    else {
                        System.out.println("The timer has started yet.");
                    }
                    break;
                }
                case 2: {
                    CaoanRestaurant.getCharlieFactory().setDirtyTrue();
                    break;
                }
                case 3: {
                    CaoanRestaurant.getCharlieFactory().setAgingTrue();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        }
    }

}
