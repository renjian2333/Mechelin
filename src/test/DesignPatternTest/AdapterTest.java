package test.DesignPatternTest;

import com.tongji.michelin.machine.transportmachine.TransportMachine;
import com.tongji.michelin.product.Product;
import com.tongji.michelin.machine.transportmachine.FDRs.Adapter;
import com.tongji.michelin.machine.transportmachine.FDRs.FDR;

import java.util.Scanner;

/**
 * @author yfh
 * @classname AdapterTest
 * @description test for Adapter
 */
public class AdapterTest {
    public static void adapterTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("***************************   Adapter Test   **************************");
        System.out.println("***                 1. 创建一个送餐机器人对象                             ***");
        System.out.println("***                 2. 设置送餐机器人属性                                 ***");
        System.out.println("***                 3. 送餐机器人开始工作！                               ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        System.out.println("请为该送餐机器人设置机器编号（ID）:");
        String machineNum = scanner.nextLine();
        System.out.println("请以此输入该机器人使用年限、lossCoefficient(0~1之间的小数)、最大容量（以空格为终止符）。");
        double lifeYear = scanner.nextDouble();
        double lossCoefficient = scanner.nextDouble();
        int maxCapacity = scanner.nextInt();
        TransportMachine transportMachine = new TransportMachine("TR", machineNum, lifeYear, lossCoefficient, maxCapacity) {
            @Override
            protected void load(Product product) {
            }

            @Override
            protected void arrive(Product product) {
            }
        };

        FDR uav = new Adapter(transportMachine);
        uav.setAimProcessNum(1);
        uav.setID(transportMachine.getMachineID());
        System.out.println("送餐机器人的机器编号为：" + uav.getID());

        System.out.println("");
        Product product = new Product("product", 5, 5) {
            @Override
            protected void initIngredientList() {
            }
        };

        System.out.println("送餐机器人开始工作……");
        uav.work(product);
    }

    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Adapter]Pattern —————————————-------------------------------------————");
        System.out.println("Adapter : work() : Use adapter to implement work function in FDR.");
        System.out.println("Adapter : navigate() : Use adapter to implement navigate function in FDR.");
        System.out.println("Machine : work() : Abstract work function in Machine base class.");
        System.out.println("FDR : work() : Interface that FDR should have work function.");
        System.out.println("FDR : navigate() : Interface that FDR should have navigate function.");
        System.out.println("");

        adapterTest();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
