import java.util.Date;

public class Transaction {

    private final Date date;
    private final double amount;

    public Transaction(double amount){
        this.date = new Date();
        this.amount = amount;
    }

    public Date getDate(){
        return this.date;
    }

    public double getAmount(){
        return this.amount;
    }
}