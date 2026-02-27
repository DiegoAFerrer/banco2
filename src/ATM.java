import java.util.ArrayList;

public class ATM{
    public static boolean authNIP(Account account, String NIP){
        if (account.getNIP().equals(NIP)){
            return true; 
        }
        else {
            return false; 
        }
    }

    public static boolean deposit(Account account, double amount){
        if (amount % 200 == 0){
            account.deposit(amount);
            return true;
        } else {
            return false;
        }
    }

    public static boolean withdraw(Account account, double amount){
        if (amount % 100 == 0){
            account.deposit(amount);
            return true;
        } else {
            return false;
        }
    }

    public static double countBills(ArrayList<Double> bills){
        double sum = 0;

        for (Double billValue : bills) {
            sum += billValue;
        }
        
        return sum;
    }
}