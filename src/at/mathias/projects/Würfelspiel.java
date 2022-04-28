package at.mathias.projects;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Würfelspiel {


    public static void main(String[] args) throws IOException {

        Random random = new Random();
        int mainMenuSelection = 0;
        int subMenuSelection = 0;
        final int CANCEL = 3;
        Scanner scanner = new Scanner(System.in);
        boolean isNewGame = true;

        while (mainMenuSelection != CANCEL) {
            System.out.println();
            System.out.println("Das Würfelspiel");
            System.out.println();
            System.out.println("1. Spielen");
            System.out.println("2. Gehen");

            try {
                mainMenuSelection = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("");
                scanner.nextInt();
            }

            if (mainMenuSelection == 1) {
                while (subMenuSelection != CANCEL) {
                    System.out.println("Du hast 6 Würfe gegen den Computer");
                    System.out.println("Drücken Sie:");
                    System.out.println();
                    System.out.println("1. neu Würfeln");
                    System.out.println("2. Highscore");
                    System.out.println("3. Menü");

                    subMenuSelection = scanner.nextInt();

                    int randomNumber = random.nextInt(1, 7);
                    int randomComputer = random.nextInt(1, 7);

                    if (subMenuSelection == 1) {

                        if (randomComputer > randomNumber) {
                            System.out.println("Du hast gegen den Computer verloren");

                        } else if (randomNumber > randomComputer) {
                            System.out.println("Du hast gegen den Computer gewonnen");
                        }
                    }


                }

            } else {
                System.out.println();
                System.out.println("Auf Wiedersehen");
                break;

            }
        }
    }
}