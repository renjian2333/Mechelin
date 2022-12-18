package test.DesignPatternTest;

import com.tongji.michelin.factory.support.payroll.BonusPayroll;
import com.tongji.michelin.factory.support.payroll.Payroll;
import com.tongji.michelin.factory.support.payroll.WagePayroll;
import com.tongji.michelin.person.Person;
import com.tongji.michelin.person.staff.Guard;
import com.tongji.michelin.person.staff.Manager;
import com.tongji.michelin.person.staff.Staff;
import com.tongji.michelin.person.staff.worker.fixworker.FixExpert;
import com.tongji.michelin.scene.staffarea.manufacturingarea.warehouse.Warehouse;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.WesternCookshop;
import com.tongji.michelin.scene.staffarea.manufacturingarea.cookshop.CookShop;

import java.util.Scanner;

/**
 * @author zqr
 * @classname ObserverTest
 * @description Test for Design Pattern --- Observer
 */
public class ObserverTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Observer] Test ------------------------------------");

        System.out.println("");
        System.out.println("Payroll : addStaff(staff : Staff) : add a staff into the payroll");
        System.out.println("Payroll : addAllStaffs(staffArea : StaffArea) : add all staffs in the staff area into the payroll");
        System.out.println("Payroll : removeStaff(staff : Staff) : remove a staff from the payroll");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        System.out.println("");
        System.out.println("***************************** Observer Test ***************************");
        System.out.println("***                 1. Create a wage payroll                        ***");
        System.out.println("***                 2. Create a bonus payroll                       ***");
        System.out.println("***                                                                 ***");
        System.out.println("***Tips: If you want to pay wages to staffs, choose order 1         ***");
        System.out.println("***      If you want to give bonus to staffs, choose order 2        ***");
        System.out.println("***********************************************************************");
        System.out.println("");


        Payroll payroll = null;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            flag = false;
            switch (op) {
                case 0:
                    return;
                case 1:
                    payroll = new WagePayroll();
                    System.out.println("\nSuccessfully create a wage payroll!");
                    break;
                case 2: {
                    System.out.print("Enter the bonus that you want to give for each staff (Input an Integer):");
                    int bonus = input.nextInt();
                    payroll = new BonusPayroll(bonus);
                    System.out.println("\nSuccessfully create a bonus payroll of " + bonus + "!");
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                    flag = true;
                }
            }
        } while (flag);


        Warehouse warehouse = new Warehouse();
        Manager manager1 = warehouse.getManager();
        manager1.hireWorker("TT", Person.Sex.MALE, 20, 5000, warehouse);
        manager1.hireWorker("Kerr", Person.Sex.FEMALE, 21, 6000, warehouse);

        CookShop cookShop = new WesternCookshop();
        Manager manager2 = cookShop.getManager();
        manager2.hireWorker("Brian", Person.Sex.MALE, 20, 50000, cookShop);
        FixExpert fixExpert = new FixExpert("Yuan", 21, Person.Sex.FEMALE, 10000, cookShop);

        Guard guard1 = new Guard("Young", 20, Person.Sex.MALE, 10);

        System.out.println("\n-------------------以上输出不重要--------------------\n");

        System.out.println("");
        System.out.println("********    Here is our worker list   ********");
        System.out.printf("***%-10s%-10s%-10s%-10s***\n", "Name", "Sex", "Age", "Salary");
        System.out.println("   In the cookshop:");
        for (Staff staff : cookShop.getWorkerList()) {
            System.out.printf("***%-10s%-10s%-10s%-10s***\n", staff.getName(), staff.getSex(), staff.getAge(), staff.getSalary());
        }
        System.out.println("");
        System.out.println("   In the warehouse:");
        for (Staff staff : warehouse.getWorkerList()) {
            System.out.printf("***%-10s%-10s%-10s%-10s***\n", staff.getName(), staff.getSex(), staff.getAge(), staff.getSalary());
        }
        System.out.println("");
        System.out.println("   Others:");
        System.out.printf("***%-10s%-10s%-10s%-10s***\n", guard1.getName(), guard1.getSex(), guard1.getAge(), guard1.getSalary());
        System.out.println("**********************************************");

        System.out.println("");
        System.out.println("***************************** Observer Test ***************************");
        System.out.println("***              Now choose the staffs who can get paid!            ***");
        System.out.println("***                                                                 ***");
        System.out.println("***              1. add the guard(Young Young) to the payroll       ***");
        System.out.println("***              2. add all staffs in the cookshop to the payroll   ***");
        System.out.println("***              3. add all staffs in the warehouse to the payroll  ***");
        System.out.println("***              4. remove a staff from the payroll                 ***");
        System.out.println("***              5. give the payroll                                ***");
        System.out.println("***                                                                 ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    payroll.addStaff(guard1);
                    break;
                case 2: {
                    payroll.addAllStaffs(cookShop);
                    break;
                }
                case 3: {
                    payroll.addAllStaffs(warehouse);
                    break;
                }
                case 4: {
                    System.out.print("Input name of the staff you want to remove:");
                    String name = input.next();
                    payroll.removeStaff(name);
                    break;
                }
                case 5: {
                    payroll.payOff();
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                    flag = true;
                }
            }
        } while (flag);
    }
}
