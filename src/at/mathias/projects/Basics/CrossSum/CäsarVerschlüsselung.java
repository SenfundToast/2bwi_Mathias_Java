package at.mathias.projects.Basics.CrossSum;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CäsarVerschlüsselung {
    public static void main(String[] args) {

        int selection = 0;
        Scanner scanner = new Scanner(System.in);
        int key = 2;
        boolean isFinished = false;

        System.out.println("1 - Verschlüsseln");
        System.out.println("2 - Entschlüsseln");
        System.out.println("3 - Beenden");
        System.out.println();

        try {
            selection = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Geben Sie eine gültige Funtkion aus");
        }
        while (!isFinished) {
            switch (selection) {
                case 1:
                    String text = scanner.nextLine();
                    System.out.println();
                    char[] chars = text.toCharArray();
                    for (char c : chars) {
                        c += key;
                        System.out.print(c);
                    }
                    System.out.println();
                    System.out.println("Geben Sie den Text an den Sie verschlüsseln wollen.");
                    System.out.println();
                    break;

                case 2:
                    text = scanner.nextLine();
                    System.out.println();
                    chars = text.toCharArray();
                    for (char c : chars) {
                        c -= key;
                        System.out.print(c);
                    }
                    System.out.println();
                    System.out.println("Geben Sie den Text an den Sie entschlüsseln wollen.");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Vorgang wird beendet...");
                    isFinished = true;
                    break;

            }
        }
    }
}
