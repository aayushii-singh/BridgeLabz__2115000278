abstract class BankAccount {
    private double balance;
    public BankAccount(double balance) { this.balance = balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public double getBalance() { return balance; }
    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) { super(balance); }
    public double calculateInterest() { return getBalance() * 0.05; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) { super(balance); }
    public double calculateInterest() { return getBalance() * 0.02; }
}

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

class Loan implements Loanable {
    public void applyForLoan() { System.out.println("Loan Applied"); }
    public boolean calculateLoanEligibility() { return true; }
}

public class BankSys {
    public static void main(String[] args) {
        BankAccount[] accounts = { new SavingsAccount(5000), new CurrentAccount(10000) };
        Loanable loan = new Loan();

        for (BankAccount account : accounts) {
            System.out.println("Interest: " + account.calculateInterest());
        }
        loan.applyForLoan();
    }
}
