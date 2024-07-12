
import java.util.Scanner;

public class MC01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegularVendingMachine rvm = null;
        while (true) {
            System.out.println("\n--------------------------");
            System.out.println("Menu");
            System.out.println("--------------------------");
            System.out.println("1. Create Vending Machine\n2. Test Vending Machine\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    rvm = new RegularVendingMachine();
                    System.out.println("\nVending machine created.");
 
                    break;
                case 2:
                    if (rvm == null) {
                        System.out.println("\nNo vending machine created yet.\n");
                        break;
                    }
                    System.out.println("\n------------------------");
                    System.out.println("Features and Maintenance");
                    System.out.println("------------------------");
                    System.out.println("1. Add Items \n2. Test Features \n3. Maintenance \n4. Return");
                    System.out.print("Enter choice: ");
                    int testChoice = sc.nextInt();
                    
                    if(testChoice == 1){
                    System.out.println("Items added successfully");
                    rvm.addItem("Fish Cake", 20.0, 10);
                    rvm.addItem("Aji Tamago", 45.0, 10);
                    rvm.addItem("Fried Tofu", 30.0, 10);
                    rvm.addItem("Sukiyaki Bento", 210.0, 10);
                    
                    }
                    else if(testChoice == 2){
                    // Test vending machine
                    rvm.insertMoney(200.0);
                    rvm.vend("Fish Cake");
                    rvm.vend("Aji Tamago");
                    rvm.vend("Sukiyaki Bento");
                    rvm.returnChange();
                        
                    }
                    else if(testChoice == 3){
                       rvm.restock("Fish Cake", 10);
                    }
                    else{
                        System.out.println("--------------------");
                        System.out.println("Returning to menu...");
                        System.out.println("--------------------");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Exiting.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

