package at.mathias.projects;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class BankomatBeispiel {
    public static void main(String[] args) throws IOException {
        //Variablen & Methoden klein - camelcase - englisch
        // Klassen Gross camelcase

        final int CANCEL = 4;

        char choice;
        int selection = 0;
        int bankBalance = 0;
        Scanner scanner = new Scanner(System.in);

        while (selection != CANCEL) {

            System.out.println();

            System.out.println("Selektieren Sie die gewünschte Funktinon:");

            System.out.println(" 1.  Einzahlen");

            System.out.println(" 2. Abheben");

            System.out.println(" 3. Kontostand");

            System.out.println(" 4. Ende");

            System.out.println("Wähle eine Zahl aus:");


            selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println();
                System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");
                int amountPaid = scanner.nextInt();
                bankBalance = bankBalance + amountPaid;
                System.out.println("Sie haben " + bankBalance + " Euro eingezahlt!");

            } else if (selection == 2) {
                System.out.println();
                System.out.println("Wieviel würden Sie gerne abheben?");
                int amountwithdrawn = scanner.nextInt();
                bankBalance = bankBalance - amountwithdrawn;
                System.out.println();
                System.out.println("Sie haben " + amountwithdrawn + " Euro abgehoben");

            } else if (selection == 3) {

                System.out.println("Der Kontostand beträgt: " + bankBalance);

            } else {
                System.out.println();
                System.out.println("Machine is stopping!");
                break;
            }
        }
    }
}

