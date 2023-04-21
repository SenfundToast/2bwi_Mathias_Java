package at.mathias.projects.OO_Basics.bank;

public class CheckingAccount extends BaseAccount{
    private int limit;

    public CheckingAccount(int limit) {
        this.limit = limit;
    }

    @Override
    public double withdraw(double amount) {
        if((getBalance()-amount)< (limit * -1) ){
            System.out.println("Withdrawn " + amount + " Euros");
            return super.withdraw(amount);
        } else {
            System.out.println("Leider keine Deckung!");
            return 0;
        }
    }
}