package at.mathias.projects.OO_Basics.bank;

public class BaseAccount {
        private double balance;

        public void deposit(double amount) {
            this.balance += amount;
        }

        public double withdraw(double amount) {
            this.balance -= amount;
            return amount;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
