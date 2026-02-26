public class Account {
    
 
  private String name;
  private int saved;
  
public Account(String name){
    this.name = name;
    this.saved = 0;
}

public void deposit(int amount){
    this.saved += amount;
}

public void withdraw(int amount){
    this.saved -= amount;
}

public int getSaved(){
    return this.saved;
}

public String getName(){
    return this.name;
}
  
}
