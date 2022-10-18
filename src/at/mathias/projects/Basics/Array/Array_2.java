package at.mathias.projects.Basics.Array;

public class Array_2 {
    public static void main(String[] args) {

        int[] data = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;

        for (int i = 0; i < data.length; i++) {
            total += data[i];
            System.out.println("Zahl + " +data[i]);
        }
        System.out.println("Total: " +total);
    }
}
