public class Account {
    private int accountNumber;
    private String name;
    private String NIP;
    private int saved;
  
    public Account(String name, String NIP){
        this.name = name;
        this.NIP = NIP;
        this.saved = 0;
    }

    public void deposit(int amount){
        if (amount <= 0) {
            System.out.println("Exception");
        } else{ 
            this.saved += amount; 
        }
    }

    public void withdraw(int amount){
        if (amount > saved) {
            System.out.println("Exception");
        } else{ 
            this.saved -= amount; 
        }
    }

    public String getNIP(){
        return this.NIP;
    }

    public int getSaved(){
        return this.saved;
    }

    public String getName(){
        return this.name;
    }
  
}
