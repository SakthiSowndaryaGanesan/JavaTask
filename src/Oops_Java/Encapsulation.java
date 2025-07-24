package Oops_Java;

class HDFCbank {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public HDFCbank(String holder, String accNumber, double initialBalance) {
        accountHolder = holder;
        accountNumber = accNumber;
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
            System.out.println("Invalid initial balance. Set to 0.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs." + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    // Display account details (excluding account number for privacy)
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Available Balance: Rs" + balance);
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        // Creating an object of BankAccount
        HDFCbank acc = new HDFCbank("Sakthi", "ACE13007", 1000);

        acc.displayAccountInfo();
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500); // Should show error
        System.out.println("Final Balance: Rs." + acc.getBalance());
    }
}
