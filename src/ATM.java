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

    public static boolean deposit(Account account, ArrayList<Double> bills) {

        double sum = countBills(bills);

        if (sum % 200 == 0){
            account.deposit(sum);
            return true;
        } else { 
            return false;
        }
    }

    public static boolean withdraw(Account account, ArrayList<Double> bills){

        double sum = countBills(bills);

        if (sum % 100 == 0){
            account.deposit(sum);
            return true;
        } else {
            return false;
        }
    }

    private static double countBills(ArrayList<Double> bills){
        double sum = 0;

        for (Double billValue : bills) {
            sum += billValue;
        }
               
        return sum;
    }
}