package test.DesignPatternTest;

import com.tongji.michelin.product.dessert.ChocolateCake;
import com.tongji.michelin.product.memento.ProductCaretaker;

import java.util.Scanner;

/**
 * @author zqr
 * @classname MementoTest
 * @description Test for Design Pattern --- Memento
 */
public class MementoTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Memento] Test ------------------------------------");

        System.out.println("");
        System.out.println("Product : createMemento() : create a memento for the product to store message of weight of single item");
        System.out.println("Product : restoreMemento(memento : Memento) : restore message from the memento");
        System.out.println("ProductMemento : setWeight(weight : int) : set the weight of product in the memento");
        System.out.println("ProductMemento : getWeight() : get the weight of product in the memento");
        System.out.println("ProductCaretaker : setProductMemento(productMemento : ProductMemento） : " +
                "set the concrete memento in the product caretaker");
        System.out.println("ProductCaretaker : getProductMemento() : get the concrete product memento");
        System.out.println("");

        System.out.println("");
        System.out.println("**************************** Memento Test *****************************");
        System.out.println("***                          1. Set the first weight of product     ***");
        System.out.println("***                          2. Store it in a memento               ***");
        System.out.println("***                          3. Set a new weight of product         ***");
        System.out.println("***                          4. Get the old weight from memento     ***");
        System.out.println("***                                                                 ***");
        System.out.println("*** Tips: This test doesn't need to input order,                    ***");
        System.out.println("***       and you just need to follow the steps.                    ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int weight;

        System.out.println("Let's make a chocolate cake !");
        System.out.print("Step 1: Input the size of the chocolate cake "+"(wight=100*size*size):" );
        weight = input.nextInt();

        ChocolateCake iceCream = new ChocolateCake(weight);
        System.out.println("");
        System.out.println("Successfully create the chocolate cake  of " + iceCream.getWeight() + " grams");
        System.out.println("");

        System.out.println("Step 2: Create a memento to store the weight of the chocolate cake ");
        System.out.println("Create a product memento...");
        ProductCaretaker caretaker = new ProductCaretaker();
        caretaker.setProductMemento(iceCream.createMemento());
        System.out.println("Message in the memento:    The weight of chocolate cake  in the memento is " +
                caretaker.getProductMemento().getWeight() + " grams.");
        System.out.println("");

        System.out.println("Step 3: Set a new weight of the chocolate cake ");
        System.out.print("Input the new weight:");
        weight = input.nextInt();
        iceCream.setWeight(weight);
        System.out.println("");
        System.out.println("Now the weight of chocolate cake  is " + iceCream.getWeight() + " grams");
        System.out.println("");

        System.out.println("Step 4: Get the old weight from memento");
        iceCream.restoreMemento(caretaker.getProductMemento());
        System.out.println("Now the weight of chocolate cake  is " + iceCream.getWeight() + " grams");
    }
}
