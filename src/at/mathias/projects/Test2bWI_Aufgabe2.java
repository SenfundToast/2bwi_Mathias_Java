package at.mathias.projects;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Test2bWI_Aufgabe2 {
    public static void main(String[] args) throws IOException{

        final int CANCEL = 11;
        int selection = 0;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        while (selection != CANCEL) {
            Random random = new Random();
            int randomNumber = random.nextInt(0, 11);

            if (randomNumber == 5){
                System.out.println("Random number ist = " + randomNumber);
                System.out.println("Summe: " + randomNumber);
                System.out.println("Wird beendet");
                break;
            }
        }
    }
}
