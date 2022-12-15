package test.DesignPatternTest;

import com.tongji.michelin.product.dessert.*;
import com.tongji.michelin.product.dessert.dessertmix.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname FlyweightTest
 * @description Test for Flyweight
 * @date 2020/11/27 13:31
 */
public class FlyweightTest {

    public static void main(String[] args) {
        final String HINT1 = "\n"
                + "*************************** Flyweight Test ****************************\n"
                + "***            <Phase 1: Create an Array of Chocolates>             ***\n"
                + "***                                                                 ***\n"
                + "***            0. Construct ChocolateMix Now                        ***\n"
                + "***            1. AlmondChocolate                                   ***\n"
                + "***            2. DarkChocolate                                     ***\n"
                + "***            3. MatchaChocolate                                   ***\n"
                + "***            4. MilkChocolate                                     ***\n"
                + "***                                                                 ***\n"
                + "***********************************************************************\n";

        final String HINT2 = "\n"
                + "*************************** Flyweight Test ****************************\n"
                + "***                <Phase 2: Compare Instance Refs>                 ***\n"
                + "***                                                                 ***\n"
                + "***                 Input two indexes to compare.                   ***\n"
                + "***           If they are referring the same instance,              ***\n"
                + "***                      \"true\" is printed.                         ***\n"
                + "***                  Else \"false\" is printed.                       ***\n"
                + "***                      Input -1 to quit.                          ***\n"
                + "***                     Index start from 0.                         ***\n"
                + "***                                                                 ***\n"
                + "***********************************************************************\n";


        System.out.println(
                "------------------------------------ [Flyweight] Test ------------------------------------");

        System.out.println("");
        System.out
                .println("ChocolateMix : ChocolateMix(typeList: List<Class<? extendsChocolate>>) : "
                        + "Get an instance of subclass of Chocolate.");
        System.out
                .println("ChocolateMix : at(index: int) : Return the Chocolate instance at index.");
        System.out.println("");
        System.out.println(HINT1);

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        ArrayList<Class<? extends Dessert>> classes = new ArrayList<>();
        Class<? extends Dessert> classChosen = null;

        do {
            System.out.print("Enter the option [0 to construct ChocolateMix now]:");
            op = input.nextInt();
            switch (op) {
                case 0:
                    classChosen = null;
                    flag = false;
                    break;
                case 1: {
                    classChosen = MangoIceCream.class;
                    break;
                }
                case 2: {
                    classChosen = MatchaIceCream.class;
                    break;
                }
                case 3: {
                    classChosen = ChocolateIceCream.class;
                    break;
                }
                case 4: {
                    classChosen = ChocolateWafer.class;
                    break;
                }
                default: {
                    classChosen = null;
                    System.out.println("Invalid Input, Please input again.");
                }
            }
            if (classChosen != null) {
                classes.add(classChosen);
                System.out.println("Added chocolate type:" + classChosen.getSimpleName());
                System.out.println("");
            } else {
                System.out.println("");
            }
        } while (flag);

        System.out.println("You will see creation of chocolate you selected here.");
        System.out.println("Each type will be displayed AT MOST ONCE:");

        try {
            DessertMix dessertMix = new DessertMix(classes);
            int index = 0;
            System.out.println("");
            System.out.println("ChocolateMix instantiated as following:");
            System.out.println("index\ttype");
            System.out.println("-----\t---------------");
            while (dessertMix.at(index) != null) {
                System.out.println(Integer.toString(index) + "\t"
                        + dessertMix.at(index).getClass().getSimpleName());
                index++;
            }
            System.out.println(HINT2);
            while (true) {
                System.out.print("Enter the indexes [-1 to quit]:");
                int lIndex = input.nextInt();
                if (lIndex == -1) {
                    return;
                }
                int rIndex = input.nextInt();
                if (rIndex == -1) {
                    return;
                }
                System.out.println(dessertMix.at(lIndex) == dessertMix.at(rIndex));
            }
        } catch (Exception e) {
            System.out.println("Failed to instantiate ChocolateMix.");
        }

    }


}
