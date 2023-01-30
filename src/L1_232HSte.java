public class L1_232HSte
{
/*
 Hayden Stewart / hayden_stewart@my.cuesta.edu
 CIS 232 / Scovil
 Lab 1
*/
        public static final int NUM_VALUES = 32;

        public static void main(String[] args)
        {
            System.out.println("CIS 232 - Lab 1 - Hayden Stewart\n");
            int [] data = randomArray(NUM_VALUES, 64);
            printArray(data, 8);

            int [] minMax = findMinMax(data);
            System.out.printf("\nMin: %4d, Max: %4d", minMax[0], minMax[1]);
        }
        // Returns an array of amount values ranging from 1-maxValue inclusive
        public static int [] randomArray (int amount, int maxValue)
        {
            int[] result = new int[amount];

            for (int i = 0; i < amount; i++) {
                result[i] = (int)(Math.random() * maxValue) + 1;
            }

            return result;
        }
        // Display the array on the screen in lines numPerLine long
        public static void printArray (int [] array, int numPerLine)
        {
            int itemCount = 1;
            for (int i = 0; i < array.length; i++, itemCount++) {
                System.out.print(array[i] + " ");
                if (itemCount == numPerLine) {
                    System.out.println();
                    itemCount = 0;
                }
            }
        }
        // Returns min at [0], max at [1]
        public static int [] findMinMax(int [] array)
        {
            int [] result = new int[2];

            int min = array[0];
            int max = array[0];

            for (int value : array)
            {
                if (value < min)
                {
                    min = value;
                }
            }
            for (int value : array)
            {
                if (value > max)
                {
                    max = value;
                }
            }
            result[0] = min;
            result[1] = max;

            return result;
        }
}
