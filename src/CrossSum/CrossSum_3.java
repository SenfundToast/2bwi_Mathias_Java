package CrossSum;

import java.sql.SQLOutput;

public class CrossSum_3 {
    public static void main(String[] args) {

        int [] arr = new int [1001];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = calculateCrossSum(i);
        }

        int[] count = new int [arr.length];

        int temp;
        for (int j : arr) {
            temp = j;
            count[temp]++;
        }

            for (int i = 1; i < count.length; i++) {
                if(count[i] == 1) {
                    System.out.printf("Die Zahl %d ist %d mal vorhanden\n", i, count[i]);
                } else if (count[i] >= 2) {
                    System.out.printf("Die Zahl %d ist %d mal vorhanden\n", i, count[i]);
                }
            }

        }
    public static int calculateCrossSum(int number) {
        int crossum = 0;
        while (0 != number) {
            crossum = crossum + (number % 10);
            number = number / 10;
        }
        return crossum;
    }
}