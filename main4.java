class BankAccount {
    String accountNumber;
    double balance;
    double interestRate;
    
    public BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double minimumBalance;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }
    
    public void withdraw(double amount) {
        if(balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied. Balance would fall below minimum.");
        }
    }
}

public class main4 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345", 1000, 0.05);
        bankAccount.deposit(500); // Outputs: Deposited: 500.0, New Balance: 1500.0
        
        SavingsAccount savingsAccount = new SavingsAccount("67890", 2000, 0.05, 500);
        savingsAccount.deposit(300); // Outputs: Deposited: 300.0, New Balance: 2300.0
        savingsAccount.withdraw(1000); // Outputs: Withdrawn: 1000.0, New Balance: 1300.0
    }
}
