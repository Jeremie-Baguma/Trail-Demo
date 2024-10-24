import java.sql.SQLOutput;

class BankAccount {
    double balance;

    public BankAccount (double initialBalance) {
        this.balance = initialBalance;
    }
 public void deposit(double amount) {
        balance += amount;
     System.out.println("Deposited:$" + amount);
 }
 public void withdraw(double amount) {

 }
}
 class SavingAccount extends BankAccount {
    public SavingAccount(double initialBalance){
        super(initialBalance);
    }
    @Override
     public void withdraw(double amount) {
        if (amount> balance)
            System.out.println("Transaction failed" + amount);
        else {
            balance -= amount;
            System.out.println("Transaction successfully done" + amount);
        }
    }
    
}