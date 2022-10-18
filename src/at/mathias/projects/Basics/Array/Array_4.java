package at.mathias.projects.Basics.Array;

import java.util.Arrays;
import java.util.Comparator;

public class Array_4 {
    public static void main(String[] args) {

        int[] input = {5, 2, 22, 9, 1, 115, 99, 69};
        Integer [] output = {54, 123, 154, 15, 4, 9 };

        Arrays.sort(input);
        System.out.println("Das ist von klein nach groß sortiert:  ");
        for (int num : input) {
            System.out.print(num + " ");
        }
        Arrays.sort(output, Comparator.reverseOrder());
        System.out.println();
        System.out.println("Das ist von groß nach klein sortiert: ");
        System.out.println(Arrays.toString(output));
    }
}
