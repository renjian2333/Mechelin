package test.DesignPatternTest;

import com.tongji.michelin.machine.processmachine.wrappermachine.WrapperMachine;
import com.tongji.michelin.machine.processmachine.wrappermachine.strategy.BagWrapStrategy;
import com.tongji.michelin.machine.processmachine.wrappermachine.strategy.BoxWrapStrategy;
import com.tongji.michelin.machine.processmachine.wrappermachine.strategy.CupWrapStrategy;
import com.tongji.michelin.product.dinner.KungPaoChicken;
import com.tongji.michelin.product.dessert.MangoIceCream;
import com.tongji.michelin.product.dessert.MatchaIceCream;
import com.tongji.michelin.product.dessert.ChocolateIceCream;
import com.tongji.michelin.product.state.ProducedState;

import java.util.Scanner;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname StrategyTest
 * @description Test for Strategy
 * @date 2020/11/20 21:36
 */
public class StrategyTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Strategy] Test ------------------------------------");

        System.out.println("");
        System.out.println("WrapStrategy : packaging(product: Product) : each kind of wrap strategy must implement this" +
                "method, which executes specific operation of wrapping.");
        System.out.println("WrapperMachine : process(product: Product) : perform the packing operation of the packing machine");
        System.out.println("WrapperMachine : setStrategy(strategy: Strategy) : set the wrapping strategy");
        System.out.println("WrapperMachine : getStrategy() : get the wrapping strategy");
        System.out.println("");

        System.out.println("");
        System.out.println("**************************** Strategy Test ****************************");
        System.out.println("***                 1. Use box wrap strategy for a chocolate cake   ***");
        System.out.println("***                 2. Use bag wrap strategy for a chocolate cookie ***");
        System.out.println("***                 3. Use cup wrap strategy for chocolate ice-cream***");
        System.out.println("***                 4. Error test                                   ***");
        System.out.println("***                                                                 ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        System.out.println("Firstly, we need to create a wrapper machine.");
        WrapperMachine wrapperMachine1 = new WrapperMachine("WP", "101", 5.0, 0.1, 50);

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();


            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("\nLet's use a box to wrap the chocolate cake.\n");
                    System.out.println("Create a chocolate cake...");
                    MangoIceCream mangoIceCream = new MangoIceCream(1);
                    mangoIceCream.setState(new ProducedState());// 假装生产完成了
                    wrapperMachine1.setStrategy(new BoxWrapStrategy());
                    wrapperMachine1.process(mangoIceCream, 1);
                    break;
                }
                case 2: {
                    System.out.println("\nLet's use a bag to wrap the chocolate cookie.\n");
                    System.out.println("Create a chocolate cookie...");
                    MatchaIceCream matchaIceCream = new MatchaIceCream(MatchaIceCream.Shape.CAT);
                    matchaIceCream.setState(new ProducedState());
                    wrapperMachine1.setStrategy(new BagWrapStrategy());
                    wrapperMachine1.process(matchaIceCream, 1);
                    break;
                }
                case 3: {
                    System.out.println("\nLet's use a cup to wrap the chocolate ice-cream.\n");
                    System.out.println("Create a chocolate ice-cream...");
                    ChocolateIceCream chocolateIceCream = new ChocolateIceCream();
                    chocolateIceCream.setState(new ProducedState());
                    wrapperMachine1.setStrategy(new CupWrapStrategy());
                    wrapperMachine1.process(chocolateIceCream, 1);
                    break;
                }
                case 4: {
                    System.out.println("\nIf using a wrapper machine without setting its strategy...\n");
                    WrapperMachine wrapperMachine2 = new WrapperMachine("WP", "102", 5.0, 0.1, 50);
                    KungPaoChicken kungPaoChicken = new KungPaoChicken();
                    wrapperMachine2.process(kungPaoChicken, 1);
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);


    }
}
