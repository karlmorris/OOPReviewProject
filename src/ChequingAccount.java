public class ChequingAccount extends BankAccount {


    final double OVERDRAFT_LIMIT = 100;
    final double OVERDRAFT_FEE = 35;


    public ChequingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (getBalance() + OVERDRAFT_LIMIT)) {
            if (amount > getBalance() ) {
                super.withdraw(amount + OVERDRAFT_FEE);
            } else {
                super.withdraw(amount);
            }
        }
    }
}
