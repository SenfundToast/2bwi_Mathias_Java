package at.mathias.projects;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class BankomatBeispiel {
    public static void main(String[] args) throws IOException {

        final int CANCEL = 4;

        char choice;
        int selection = 0;
        int bankBalance = 0;
        Scanner scanner = new Scanner(System.in);
        while ( selection!= CANCEL ) {
            System.out.println("Selektieren Sie die gewünschte Funktinon:");

            System.out.println(" 1.  Einzahlen");

            System.out.println(" 2. Abheben");

            System.out.println(" 3. Kontostand");

            System.out.println(" 4. Ende");

            System.out.println("Wähle eine Zahl aus:");

        }
        System.out.println();

        while (selection!= CANCEL) {
            if (selection == 1)
                System.out.println();
                System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");
            int depositedAmount = scanner.nextInt();
            bankBalance = bankBalance + depositedAmount;
                System.out.println("Kontostand nach Überweisung: " + bankBalance);
                System.out.println();
        }
    }
}
