import java.util.Scanner;

public class DescendingOrder {
    // TODO: Write a void method selectionSortDescendTrace() that takes
    //       an integer array and the number of elements in the array as arguments,
    //       and sorts the array into descending order.
    public static void selectionSortDescendTrace(int [] numbers, int numElements) {
        for (int i = 0; i < numElements - 1; i++) {
            int indexBig = i;
            for (int j = i + 1; j < numElements; j++) {
                if (numbers[j] > numbers[indexBig]) {
                    indexBig = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[indexBig];
            numbers[indexBig] = temp;
            for (int k = 0; k < numElements; k++) {
                System.out.print(numbers[k] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        final int quit = -1;
        int numElements = 0;
        int [] numbers = new int[10];

        // TODO: Read in a list of up to 10 positive integers; stop when
        //       -1 is read. Then call selectionSortDescendTrace() method.
        System.out.println("Enter 10 positive integers followed by -1: ");

        for (int i = 0; i < numbers.length; i++, numElements++) {
            numbers[i] = scnr.nextInt();
            if (numbers[i] == quit) {
                break;
            }
        }
        selectionSortDescendTrace(numbers, numElements);
        System.out.println("Number of elements: " + numElements);
    }
}

