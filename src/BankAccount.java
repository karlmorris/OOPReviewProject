abstract public class BankAccount {
    private double balance;
    private String accountHolderName, accountNumber;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
