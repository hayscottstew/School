public class isDivisible {

    public static boolean isDivisibleBy (int[] arrayValues, int arraySize, int divisor) {

        boolean divisible = false;
        for (int value: arrayValues) {

            divisible = value % divisor == 0 ? true : false;
        }
        return divisible;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 5};
        int arraySize = 3;
        int divisor = 2;
        System.out.println(isDivisibleBy(arr, arraySize, divisor));
    }

}
