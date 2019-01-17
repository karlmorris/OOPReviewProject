public class CDAccount extends BankAccount implements Compoundable {

    final double INTEREST_RATE = .05;
    final double MINIMUM_BALANCE = 5000;

    public CDAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {}

    @Override
    public void addInterest() {
        deposit(getBalance()>MINIMUM_BALANCE ? getBalance() * INTEREST_RATE : 0 );
    }
}
