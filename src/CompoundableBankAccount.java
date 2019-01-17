public abstract class CompoundableBankAccount extends BankAccount implements Compoundable {
    public CompoundableBankAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
}
