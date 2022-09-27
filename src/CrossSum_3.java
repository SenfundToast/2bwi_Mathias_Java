public class CrossSum_3 {
    public static void main(String[] args) {
        for (int cnt = 0; cnt < 1001; cnt++) {
            String numberAsString = Integer.toString(cnt);
            char[] number = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < number.length; i++) {
                sum = sum + Character.getNumericValue(number[i]);
                System.out.println("Quersumme von " + cnt +  ": " + sum);
            }


            int [] arr = new int [1001];



            int[] count = new int [arr.length];


            for (int i = 0; i < count.length; i++) {

            }
        }
    }
    public static int getCrossum()
}