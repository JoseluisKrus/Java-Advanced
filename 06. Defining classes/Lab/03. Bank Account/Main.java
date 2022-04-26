public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(500);
        BankAccount.setInterestRate(2);
        System.out.println(bankAccount.getInterestRate(5));
    }
}
