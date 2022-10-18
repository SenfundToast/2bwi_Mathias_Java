package at.mathias.projects.tests;

import java.io.IOException;
import java.util.Random;

public class Test2bWI_Example1 {
    public static void main(String[] args) throws IOException {

        Random random = new Random();
        int randomNumber2 = random.nextInt(0, 1001);
        int randomNumber = random.nextInt(0, 1001);

        System.out.println("Erste Zufallszahl " + randomNumber2);
        System.out.println("Zweite Zufallszahl " + randomNumber);

        int i;
        if (randomNumber < randomNumber2) {
            for (i = randomNumber2; i >= randomNumber; i--);
            System.out.println("Zahl: " + i);

        } else if (randomNumber2 > randomNumber) {
            System.out.println("geht nicht");
        }
    }
}
