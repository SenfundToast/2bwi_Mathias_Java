package at.mathias.projects.Basics.CrossSum;

public class CrossSum_1 {
    public static void main(String[] args) {
        for (int cnt = 0; cnt < 1001; cnt++){
            String numberAsString = Integer.toString(cnt);
            char[] number = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < number.length; i++) {
                sum = sum + Character.getNumericValue(number[i]);
             }

             if (sum==15){
                System.out.println("Number: " + cnt + " Quersumme: " + sum);
            }
        }
    }
}
