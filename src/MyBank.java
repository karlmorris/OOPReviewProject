public class MyBank {
    public static void main(String[] args) {
        BankAccount bankAcconut = new SavingsAccount("123XYZ", "Kevin", 45);

        bankAcconut.deposit(100);
        bankAcconut.deposit(125);
        bankAcconut.withdraw(50);

        System.out.println("Balance: " + bankAcconut.getBalance());

        addInterest(new SavingsAccount("123", "Kevin", 50));

    }


    public static void addInterest(Compoundable accounts) {

    }
}
