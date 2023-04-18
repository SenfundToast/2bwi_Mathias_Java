package at.mathias.projects.OO_Basics.bank;

public class SavingsAccount {
    public boolean getBalance;

    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount) > 0) {
            return super.withdraw(amount);
        } else {
            System.out.println("Keine Deckung!");
            return 0;
        }
    }
}
