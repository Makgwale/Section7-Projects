public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Kgwale", 0);
        BankAccount account2 = new BankAccount("Myles",500);
        BankAccount account3 = new BankAccount("Laty");


//        System.out.println("Deposit");
//        balance =  account2.deposit(500);
//        System.out.println("Owner :" + account2.getOwner());
//        System.out.println("Balance : " + balance);
//
//        System.out.println("Withdrawal");
//        balance = account2.withdraw(2000);
//        System.out.println("Owner :" + account2.getOwner());
//        System.out.println("Balance : " + balance);

        account1.deposit(500);
        account1.printDetails();
        System.out.println();

        account1.withdraw(200);
        account1.printDetails();
        System.out.println();

        account2.deposit(200);
        account2.printDetails();
        System.out.println();

        account2.withdraw(800);
        account2.printDetails();
        System.out.println();

        account3.printDetails();

    }

}
