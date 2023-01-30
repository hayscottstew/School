/*
    CIS231Ch08Examples
    R. Scovil / rscovil@cuesta.edu

    Examples of:
    8.7 - Insertion Sort - a more optimal implementation
 */

import java.util.Random;

public class CH8Examples
{
    // Avoid "Magic Numbers" - easy to read/update
    // Visibility can vary but since it's constant, can't be changed
    public static final int MAX_RAN_AMT = 50;
    public static final int MIN_RAN_AMT = 15;
    private static final int RANDOM_MAX = 100;

    public static void main (String [] args)
    {
        Random rng = new Random();

        // Determine random amount of random numbers
        int randomAmount = rng.nextInt(MAX_RAN_AMT - MIN_RAN_AMT + 1) + MIN_RAN_AMT;

        // Create array now that we know the size we need
        int [] values = new int [ randomAmount ];

        for (int i = 0 ; i < randomAmount; i++)
        {
            values[i] = rng.nextInt(RANDOM_MAX) + 1;
        }

        System.out.println("Original unsorted random array:");
        displayArray(values);

        insertionSort(values);

        System.out.println("\nArray after insertion sort:");
        displayArray(values);
    }

    // Revised Insertion Sort
    //   Note elimination of swaps
    //   *** Why is the return type void?
    public static void insertionSort( int [] data )
    {
        //  Note starting index
        for (int i = 1; i < data.length; i++)
        {
            int temp = data[i];

            // think about why this is declared here
            int j = i;

            // for is a better choice, we know max # of iterations
            //   note we can leave the first (or any) clause blank
            for ( ; j > 0 && temp < data[j-1]; j--)
            {
                data[j] = data[j-1];
            }

            data[j] = temp;
        }
    }

    // Optimized output in lines of 10
    //   As we're seeing in this chapter, it's not how much code, but...
    //     ...how much work each line of code leads to
    public static void displayArray( int [] data )
    {
        //  final prevents this from being changed in code
        final int MAX_ITEMS_LINE = 10;
        int itemCount = 0;

        for (int i = 0; i < data.length; i++)
        {
            //  Print out int, right-justified over 4 spaes
            System.out.printf("%4d", data[i]);
            //  Review prefix/postfix increments as needed
            if (++itemCount == MAX_ITEMS_LINE) {
                System.out.println();
                itemCount = 0;
            }
        }

        // Never end with ragged output
        System.out.println();
    }
}
