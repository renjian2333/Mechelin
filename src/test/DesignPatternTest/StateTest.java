package test.DesignPatternTest;

import com.tongji.michelin.machine.processmachine.productmachine.BasicProductMachine;
import com.tongji.michelin.machine.processmachine.wrappermachine.WrapperMachine;
import com.tongji.michelin.machine.processmachine.wrappermachine.strategy.BagWrapStrategy;
import com.tongji.michelin.product.Product;
import com.tongji.michelin.product.dessert.MangoIceCream;
import com.tongji.michelin.product.state.PackagedState;
import com.tongji.michelin.product.state.ProducedState;
import com.tongji.michelin.product.state.ProducingState;

import java.util.Scanner;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname StateTest
 * @description Test for Design Pattern --- State
 * @date 2020/11/24 17:43
 */
public class StateTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [State] Test ------------------------------------");

        System.out.println("");
        System.out.println("ProductState : gotoNextState() : change state of the product into the next state.");
        System.out.println("Product : getState() : get the current state of the product.");
        System.out.println("");

        System.out.println("");
        System.out.println("***************************** State Test ******************************");
        System.out.println("***                           1. Produce the product                ***");
        System.out.println("***                           This order will take the product into ***");
        System.out.println("***                           produced state.                       ***");
        System.out.println("***                                                                 ***");
        System.out.println("***                           2. Package the product                ***");
        System.out.println("***                           This order will take the product into ***");
        System.out.println("***                           packaged state.                       ***");
        System.out.println("***                                                                 ***");
        System.out.println("***                           3. Store the product                  ***");
        System.out.println("***                           This order will take the product into ***");
        System.out.println("***                           stored state.                         ***");
        System.out.println("***                                                                 ***");
        System.out.println("***Tips: You must take the order step by step!!                     ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        // You can create any product here.
        Product product = new MangoIceCream(1);
        System.out.println("The initial state of product is \"" + product.getState() + "\"");

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            if (op == 1 && !(product.getState() instanceof ProducingState)
            || op == 2 && !(product.getState() instanceof ProducedState)
            || op == 3 && !(product.getState() instanceof PackagedState)) {
                System.out.println("Please execute the order step by step!");
                continue;
            }

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Let's produce the chocolate cake.");
                    System.out.println("Create a product machine...");
                    BasicProductMachine bpm = new BasicProductMachine("PR", "101");
                    product.setProduceMachine(bpm);
                    product.producing();

                    System.out.println("\nNow the state of the product is \"" + product.getState() + "\"");
                    break;
                }
                case 2: {
                    System.out.println("Let's package the chocolate cake.");
                    System.out.println("Create a wrapper machine...");
                    WrapperMachine wm = new WrapperMachine("PA","101");
                    wm.setStrategy(new BagWrapStrategy());
                    product.setWrapperMachine(wm);
                    product.packaging();

                    System.out.println("\nNow the state of the product is \"" + product.getState() + "\"");
                    break;
                }
                case 3: {
                    product.storing();
                    System.out.println("\nNow the state of the product is \"" + product.getState() + "\"");
                    break;
                }
                default: {
                    System.out.println("\nInvalid Input, Please input again.");
                    break;
                }
            }
        } while (flag);
    }
}
