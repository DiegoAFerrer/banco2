import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Account account = new Account(name);

        int option;

        do {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Balance: $" + account.getSaved());
                    break;

                case 4:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (option != 4);

        sc.close();
    }
}