package at.mathias.projects;

import java.util.Random;

public class IfBedingungAufgabe_2 {
    public static void main(String[] args) {


        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt( 100);

        System.out.println("First number: " + randomNumber1);
        System.out.println("Second number: " + randomNumber2);

        if (randomNumber1 < randomNumber2 && randomNumber1 < 50) {
            System.out.println("Zahl ist kleiner als Zahl 2 und Mini");
        }

        else if (randomNumber1 < 30 || randomNumber2 < 30) {
            System.out.println("Eine der beiden ist kleienr als 30");
        }
        else if (randomNumber1 < 50 && randomNumber2 != 50){
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
    }
}
