public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner){
        this(owner,0);
    }
    public BankAccount(String owner, int balance){
        this.owner = owner;
        if(balance >= 0)
         this.balance = balance;
        else
            System.out.println("Invalid balance amount");

    }
    public String getOwner(){
        return owner;
    }

    public void withdraw(int amount){
        if(amount > 0 && balance >= amount) {
            System.out.println("Withdrawal");
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds");
        }

    }

    public void deposit(int amount){
        if(amount > 0){
            System.out.println("Deposit");
             balance += amount;
        }
        else{
            System.out.println("Invalid amount entry, amount must be greater than 0.");
        }
    }

    public void printDetails(){
        System.out.println("Owner :" + getOwner());
        System.out.println("Balance : " + balance);
    }

}
