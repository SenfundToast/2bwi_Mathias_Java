public class CrossSum_3 {
    public static void main(String[] args) {

        int [] arr = new int [1001];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = calculateCrossSum(i);
        }

            int sum = 0;
            for (int i = 0; i < number.length; i++) {
                sum = sum + Character.getNumericValue(number[i]);
                System.out.println("Quersumme von " + i +  ": " + sum);
            }

            int[] count = new int [arr.length];


            for (int i = 0; i < count.length; i++) {

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