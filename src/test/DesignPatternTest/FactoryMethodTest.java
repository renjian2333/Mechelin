package test.DesignPatternTest;

import com.tongji.michelin.product.dinner.Dinner;
import com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline.AssemblyNameConst;
import com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline.RestaurantProducer;
import com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline.DishAssemblyLine;

import java.util.Scanner;

/**
 * @author Y.C.Young
 * @project chocolateFactory
 * @classname FactoryPatternTest
 * @description Test for factory method
 * @date 2020/11/23 19:34
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        System.out.println("------------------------------------ Factory Method Test ------------------------------------");

        System.out.println("");
        System.out.println("ChocolatesFactoryProducer : newChocoMachine(factoryName: String) : create one chocolate assembly line instance with the given name");
        System.out.println("MilkChocolateAssemblyLine : getChocolate() : create one milk chocolate instance");
        System.out.println("AlmondChocolateAssemblyLine : getChocolate() : create one almond chocolate instance");
        System.out.println("");

        System.out.println("");
        System.out.println("*********************** Factory Method Test ***************************");
        System.out.println("***                     1. milk chocolate                           ***");
        System.out.println("***                     2. almond chocolate                         ***");
        System.out.println("***                                                                 ***");
        System.out.println("***            Input the chocolate you're gonna create              ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        while (flag) {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("\nNow let's create a milk chocolate instance.");
                    DishAssemblyLine mkLine = RestaurantProducer.newRestaurant(AssemblyNameConst.WESTERN_RESTAURANT);
                    Dinner mkChocolate = mkLine.getDinner();
                    System.out.print("Here is the chocolate we've just created: ");
                    mkChocolate.dispaly();
                    break;
                }
                case 2: {
                    System.out.println("\nNow let's create an almond chocolate instance.");
                    DishAssemblyLine alLine = RestaurantProducer.newRestaurant(AssemblyNameConst.CHINESE_RESTAURANT);
                    Dinner alChocolate = alLine.getDinner();
                    System.out.print("Here is the chocolate we've just created: ");
                    alChocolate.dispaly();
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        }

    }

}
