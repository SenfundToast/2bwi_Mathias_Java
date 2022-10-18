package at.mathias.projects.Projects;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class DiceGame {


    public static void main(String[] args) throws IOException {

        Random random = new Random();
        int mainMenuSelection = 0;
        int subMenuSelection = 0;
        int gameMenuSelection = 0;
        int diceRoll = 6;
        int playerPoints = 0;
        int computerPoints = 0;
        int playerTotalPoints = 0;
        int computerTotalPoints = 0;
        final int CANCEL = 3;
        Scanner scanner = new Scanner(System.in);

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
                    System.out.println();
                    System.out.println("Drücken Sie:");
                    System.out.println();
                    System.out.println("1. neu Würfeln");
                    System.out.println("2. Punkte");
                    System.out.println("3. Menü");

                    subMenuSelection = scanner.nextInt();

                    int randomNumber = random.nextInt(1, 7);
                    int randomComputer = random.nextInt(1, 7);

                    if (subMenuSelection == 1) {

                        if (randomComputer > randomNumber) {
                            System.out.println();
                            computerPoints += 1;
                            diceRoll -= 1;
                            System.out.println("Spieler wins " + playerPoints);
                            System.out.println("Computer wins " + computerPoints);
                            System.out.println("Sie haben nun " + diceRoll + " würfe gegen den Computer");

                        } else if (randomNumber > randomComputer) {
                            System.out.println();
                            playerPoints += 1;
                            diceRoll -= 1;
                            System.out.println("Spieler wins " + playerPoints);
                            System.out.println("Computer wins " + computerPoints);
                            System.out.println("Sie haben gegen den Computer gewonnen");
                            System.out.println("Sie haben nun " + diceRoll + " würfe gegen den Computer");

                            if (diceRoll == 0) {
                                System.out.println();
                                System.out.println("Ende der Runde um wieder zu Spielen drücken Sie 1");


                            if (playerPoints > computerPoints) {
                                playerTotalPoints += 1;
                            } else if (computerPoints > playerPoints) {
                                playerTotalPoints += 1;
                                playerPoints = 0;
                                computerPoints = 0;
                                diceRoll = 6;
                            } else if (gameMenuSelection == 1) {

                            }
                         }
                        }
                    }
                    if (subMenuSelection == 2) {
                        System.out.println("Spieler Punkte: " + playerTotalPoints);
                        System.out.println("Computer Punkte: " + computerTotalPoints);
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