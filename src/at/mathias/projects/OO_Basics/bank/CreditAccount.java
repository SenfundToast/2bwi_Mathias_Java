package at.mathias.projects.OO_Basics.bank;

public class CreditAccount {
    private double balance;

    public CreditAccount(double amount, double interestRate, double yearFactor) {
        this.balance -= amount * Math.pow((1 + interestRate / 100), yearFactor);
    }

    public void payOffCredit(double amount) {
        this.balance += amount;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
