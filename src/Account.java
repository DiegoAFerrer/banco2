
import java.util.ArrayList;

public class Account {
    private static int nextInt = 0;
    private final int accountNumber;
    private String name;
    private String NIP;
    private double saved;
    private ArrayList<Transaction> transactionHistory;
  
    public Account(String name, String NIP){
        this.accountNumber = nextInt++;
        this.name = name;
        this.NIP = NIP;
        this.saved = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void registerTransaction(double amount){
        Transaction transaction = new Transaction(amount);
        transactionHistory.add(transaction);
    }

    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Exception");
        } else{ 
            this.saved += amount; 
        }
        registerTransaction(amount);
    }

    public void withdraw(double amount){
        if (amount > saved) {
            System.out.println("Exception");
        } else{ 
            this.saved -= amount; 
        }

        registerTransaction(amount * -1);
    }

    public String getNIP(){
        return this.NIP;
    }

    public double getSaved(){
        return this.saved;
    }

    public String getName(){
        return this.name;
    }
  
}
