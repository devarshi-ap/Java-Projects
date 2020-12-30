public class Account {

    private int balance = 0;
    private String typeAccount;


    public Account(int balance, String typeAccount){
        this.balance = balance;
        this.typeAccount = typeAccount;
    }
    

    public int getBalance(){
        return balance;
    }


    public void withdraw(int amount){
        if(balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("**Insufficient funds**");
        }
    }


    public void deposit(int amount){
        balance += amount;
    }
    
}
