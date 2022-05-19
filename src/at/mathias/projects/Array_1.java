package at.mathias.projects;

import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args){
        int a = 7;
        int b = 8;
        int c = 1;
        int d = 10;

        int[] data = {7,8,1,10};

        int tmp = data[0];
        System.out.println(tmp);

        int[] userInput = new int [10];

        Scanner scanner = new Scanner(System.in);

        //don't repeat yourself DRY


        System.out.println(userInput);
        String[] names ={"hans","paul","sepp"};
        System.out.println(names[1]);

        String myName = "hans";
        char[] chars = myName.toCharArray();
        System.out.println("stop");

    }
}
