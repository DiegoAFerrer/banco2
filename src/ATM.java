public class ATM{
    public boolean authNIP(Account account, String NIP){
        if (account.getNIP() == NIP){
            return true; 
        }
        else {
            return false; 
        }
    }

    public boolean deposit(Account account, double amount)
}