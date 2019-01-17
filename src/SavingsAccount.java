public class SavingsAccount extends CompoundableBankAccount {

    final double INTEREST_RATE = .02;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw (double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
        }
    }

    @Override
    public void addInterest() {
        deposit(getBalance() * INTEREST_RATE);
    }
}
