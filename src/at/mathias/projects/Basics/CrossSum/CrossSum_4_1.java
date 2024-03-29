package at.mathias.projects.Basics.CrossSum;

public class CrossSum_4_1 {
    public static void main(String[] args) {

        for (int cnt = 0; cnt < 1001; cnt++) {
            String numberAsString = Integer.toString(cnt);
            char[] number = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < number.length; i++) {
                sum = sum + Character.getNumericValue(number[i]);
            }

            while (sum > 9){
                int temporary = sum;
                sum = 0;
                while (temporary > 0) {
                    sum += temporary % 10;
                    temporary /= 10;
                }
            }
            System.out.println("Number: " + cnt + " iterierteQuersumme: " + sum);
        }
    }
}

