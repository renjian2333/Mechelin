package test.DesignPatternTest;

import com.tongji.michelin.product.dinner.Dinner;
import com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline.AssemblyNameConst;
import com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline.RestaurantProducer;
import com.tongji.michelin.scene.staffarea.manufacturingarea.assemblyline.DishAssemblyLine;

import java.util.Scanner;

/**
 * @author yfh
 * @classname FactoryPatternTest
 * @description Test for factory method
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        System.out.println("------------------------------------ Factory Method Test ------------------------------------");

        System.out.println("");
        System.out.println("RestaurantProducer : newRestaurant(restaurantName: String) : create one restaurant instance with the given name");
        System.out.println("WesternDishAssemblyLine : getDish() : create one western dish instance");
        System.out.println("ChineseDishAssemblyLine : getDish() : create one chinese dish instance");
        System.out.println("");

        System.out.println("");
        System.out.println("********************* Factory Method Test *************************");
        System.out.println("***                     1. western dish                         ***");
        System.out.println("***                     2. chinese dish                         ***");
        System.out.println("***                                                             ***");
        System.out.println("***            Input the dinner you're gonna create             ***");
        System.out.println("*******************************************************************");
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
                    System.out.println("\nNow let's create a western dish instance.");
                    DishAssemblyLine chineseLine = RestaurantProducer.newRestaurant(AssemblyNameConst.WESTERN_RESTAURANT);
                    Dinner chineseLineDinner = chineseLine.getDinner();
                    System.out.print("Here is the dinner we've just created: ");
                    chineseLineDinner.dispaly();
                    break;
                }
                case 2: {
                    System.out.println("\nNow let's create a chinese dish instance.");
                    DishAssemblyLine westernLine = RestaurantProducer.newRestaurant(AssemblyNameConst.CHINESE_RESTAURANT);
                    Dinner westernLineDinner = westernLine.getDinner();
                    System.out.print("Here is the dinner we've just created: ");
                    westernLineDinner.dispaly();
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        }

    }

}
