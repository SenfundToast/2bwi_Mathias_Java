package at.mathias.projects.OO_Basics.bank;

import at.mathias.projects.OO_Basics.bank.CheckingAccount;
import at.mathias.projects.OO_Basics.bank.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        BaseAccount base1 = new BaseAccount();
        CheckingAccount check1 = new CheckingAccount(2000);

        SavingsAccount save1 = new SavingsAccount();
        save1.deposit(2000);
        save1.withdraw(2000);
        System.out.println(save1.getBalance);
    }
}
