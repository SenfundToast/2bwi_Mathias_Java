package at.mathias.projects.OO_Basics.bank;

import at.mathias.projects.OO_Basics.bank.CheckingAccount;
import at.mathias.projects.OO_Basics.bank.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        BaseAccount base1 = new BaseAccount();
        CheckingAccount check1 = new CheckingAccount(3000);

        SavingsAccount save1 = new SavingsAccount();
        save1.deposit(50);
        save1.withdraw(40);
        System.out.println(save1.getBalance);
    }
}
