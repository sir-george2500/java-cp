// BankAccount.java - Encapsulation example
public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private static double minimumBalance = 100.0;
    
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance >= minimumBalance) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Initial balance must be at least $" + minimumBalance);
        }
    }
    
    // Controlled access to balance
    public double getBalance() {
        return balance;
    }
    
    // Controlled modification of balance
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
            return true;
        } else {
            System.out.println("Deposit amount must be positive");
            return false;
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
            return false;
        }
    }
    
    // Read-only access to account info
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    // Static method for minimum balance
    public static double getMinimumBalance() {
        return minimumBalance;
    }
}