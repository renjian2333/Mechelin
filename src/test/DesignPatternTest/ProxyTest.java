package test.DesignPatternTest;

import com.tongji.michelin.supplement.proxy.PortableBattery;
import com.tongji.michelin.supplement.proxy.PortableBatteryProxy;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author zqr
 * @classname ProxyTest
 * @description test for proxy pattern
 */
public class ProxyTest {

    /**
     * run the test
     */
    public static void runTest() {

        List<PortableBatteryProxy> ProxyList = new ArrayList<PortableBatteryProxy>();

        while (true) {
            System.out.println("");
            System.out.println("----------------Proxy Test---------------");
            System.out.println("**      1 --- Show all information     **");
            System.out.println("**      2 --- New a PortableBattery    **");
            System.out.println("**      3 --- Take a PortableBattery   **");
            System.out.println("**      4 --- Return a PortableBattery **");
            System.out.println("**      5 --- Exit                     **");
            System.out.println("-----------------------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.println("");
            System.out.print("Input your order:");
            int order = 0;
            try {
                order = sc.nextInt();
            } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                System.out.println("Invalid Input, Please input again.\n");
                System.out.println("");
            }
            switch (order) {
                case 1: {
                    for (int i = 0; i < ProxyList.size(); i++) {
                        String State;
                        PortableBattery portableBattery = ProxyList.get(i).getPortableBatteryInstance();
                        if (portableBattery.isOccupied()) {
                            State = "Taken";
                        } else {
                            State = "Not Taken";
                        }
                        System.out.println("PortableBattery No." + (i + 1) + ", State: " + State);
                    }
                    break;
                }
                case 2: {
                    PortableBattery portableBattery = new PortableBattery();
                    PortableBatteryProxy portableBatteryProxy = new PortableBatteryProxy(portableBattery);
                    ProxyList.add(portableBatteryProxy);
                    System.out.println("Create a new PortableBattery! It's portableBattery No." + ProxyList.size());
                    break;
                }
                case 3: {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input the index of the PortableBattery to take：");
                    try {
                        int tool_num = input.nextInt();
                        if (tool_num > 0 && tool_num <= ProxyList.size() + 1) {
                            ProxyList.get(tool_num - 1).take();
                        } else {
                            System.out.println("Invalid Input, Please input again.\n");
                        }
                    } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("Invalid Input, Please input again.\n");
                        System.out.println("");
                    }
                    break;
                }
                case 4: {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input the index of the PortableBattery to return：");
                    try {
                        int tool_num = input.nextInt();
                        if (tool_num > 0 && tool_num <= ProxyList.size() + 1) {
                            ProxyList.get(tool_num - 1).returnPortableBattery();
                        } else {
                            System.out.println("Invalid Input, Please input again.\n");
                        }
                    } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("Invalid Input, Please input again.\n");
                        System.out.println("");
                    }

                    break;
                }
                case 5: {
                    return;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.\n");
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("—————————————-------------------------------------———— [Proxy] Test —————————————-------------------------------------————");
        System.out.println("PortableBattery : PortableBattery() : Inherited from Supply, create an instance of PortableBattery.");
        System.out.println("PortableBatteryProxy : PortableBatteryProxy() : Implements PortableBatterySubjects, create an instance of PortableBatteryProxy and bind it to an PortableBattery.");
        System.out.println("PortableBatteryProxy : take() : Implements PortableBatterySubjects, take the portableBattery through the proxy.");
        System.out.println("PortableBatteryProxy : returnPortableBattery() : Implements PortableBatterySubjects, return the portableBattery to the proxy.");
        System.out.println("");

        ProxyTest.runTest();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
