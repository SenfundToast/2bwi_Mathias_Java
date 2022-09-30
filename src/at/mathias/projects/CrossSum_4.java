package at.mathias.projects;

public class CrossSum_4 {
    public static void main(String[] args) {

        int summe = 0;


        for (int cnt = 0; cnt < 1001; cnt++) {
            String numberAsString = Integer.toString(cnt);
            char[] number = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < number.length; i++) {
                sum = sum + Character.getNumericValue(number[i]);
                System.out.println("Quersumme von " + cnt + ": " + sum);
            }
        }
    }
}
