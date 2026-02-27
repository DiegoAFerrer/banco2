import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your NIP:");
        String NIP = sc.nextLine();

        Account account = new Account(name, NIP);

        int option;

        ArrayList<Double> inputBills = new ArrayList<>();

        do {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.println("Choose option: ");

            option = sc.nextInt();
            boolean success = false;
            double counting;

            switch (option) {

                case 1:
                    System.out.print("Amount to deposit (Counting will stop when '0' is read): ");
                    
                    do {
                        counting = sc.nextDouble();
                        if (counting != 0){
                            inputBills.add(counting);
                        }
                    } while (counting != 0);
                    success = ATM.deposit(account, inputBills);
                    System.out.println(success);
                    break;

                case 2:
                    System.out.print("Amount to withdraw (Counting will stop when '0' is read): ");

                    do {
                        counting = sc.nextDouble();
                        if (counting != 0){
                            inputBills.add(counting);
                        }
                    } while (counting != 0);

                    success = ATM.withdraw(account, inputBills);
                    System.out.println(success);
                    break;

                case 3:
                    System.out.println("Balance: $" + account.getSaved());
                    break;

                case 4:
                    System.out.println(account.getTransactionHistory());
                    break;

                case 5:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (option != 5);

        sc.close();
    }
}