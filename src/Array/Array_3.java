package Array;

import java.util.Random;

public class Array_3 {
    public static void main(String[] args){
        Random random = new Random ();
        int total =0;

        int[] data = new int[50];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(0, 101);
            System.out.println("Nr: " + i + " ...Zufallszahl: " + data[i]);
            total += data[i];
        }
        System.out.println("Summe: " +total);
    }
}
