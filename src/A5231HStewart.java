/*
    @author Hayden Stewart
    CIS 231 - Assignment 5
    Randy Scovil / Cuesta College
    Due Date: Dec. 2, 2022 @ 11:59pm
 */

import java.lang.reflect.Array;
import java.util.*;

public class A5231HStewart {

    public static int getModeIndex(ArrayList<Integer> aL)
    {
        int mode = 0;
        int maxFreq = 0;

        for (int i = 0; i < aL.size(); i++)
        {
            int count = countOccurrence(aL, i);
            if (count > maxFreq)
            {
                mode = aL.get(count);
                maxFreq = count;
            }
        }
        return mode;
    }

    public static int countOccurrence (ArrayList<Integer> aL, int index)
    {
        int count = 0;

        for (Integer n : aL)
        {
            if (aL.get(index) == n)
            {
                count++;
            }
        }
        return count;
    }

    public static double getAverage (ArrayList<Integer> aL)
    {
        int sum = 0;
        for (Integer value : aL)
        {
            sum += value;
        }
        return (sum / (double)aL.size());
    }

    public static int getMax (ArrayList<Integer> aL)
    {
        Integer max = aL.get(0);

        for (Integer value : aL)
        {
            if (value > max)
            {
                max = value;
            }
        }

        int maximum = max;
        return maximum;
    }

    public static int getMin (ArrayList<Integer> aL)
    {
        Integer min = aL.get(0);

        for (Integer value : aL)
        {
            if (value < min)
            {
                min = value;
            }
        }

        int minimum = min;
        return minimum;
    }

    public static void ascendSortAL (ArrayList<Integer> aL)
    {
        for (int i = 1; i < aL.size(); i++)
        {
            Integer temp = aL.get(i);

            int j = i;

            for ( ; j > 0 && temp < aL.get(j - 1); j--)
            {
                aL.set(j, aL.get(j - 1));
            }
            aL.set(j, temp);
        }
    }

    public static String getInput(Scanner input)
    {
        System.out.println("Please input any # of integers");
        System.out.println("Must be separated by whitespace");
        System.out.println("Non-integers are ignored");
        System.out.print("-->");

        String userIn = input.nextLine();

        return userIn;
    }

    public static ArrayList<Integer> setArrayList (String inputLine)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        Scanner sc = new Scanner(inputLine);

        while (sc.hasNext())
        {
            if (sc.hasNextInt())
            {
                result.add(sc.nextInt());
            }
            else
            {
                sc.next();
            }
        }
        return result;
    }

    public static void printHeader ()
    {
        String out = "Hayden Stewart - CIS 231 - Assignment 5";
        System.out.printf("\n%50s\n", out);
        System.out.println();
    }

    public static void printNumInts (ArrayList<Integer> aL)
    {
        System.out.printf("\n# of integers input: %d\n", aL.size());
        System.out.println("------------------------");
    }

    public static void printAscendingAL(ArrayList<Integer> aL)
    {
        int count = 0;
        ascendSortAL(aL);

        System.out.println("Sorted integers:");
        for (Integer n : aL)
        {
            if (count < 10)
            {
                System.out.print(n + " ");
                count++;
            }
            else
            {
                System.out.println();
                System.out.print(n + " ");
                count = 0;
            }
        }
        System.out.println();
    }

    public static void printHighLowValues (ArrayList<Integer> aL)
    {
        System.out.println("------------------------");
        System.out.printf("High:%8d\n", getMax(aL));
        System.out.printf("Low:%9d\n", getMin(aL));
        System.out.println();
    }

    public static void printAverage (ArrayList<Integer> aL)
    {
        System.out.printf("Average:%8.2f\n", getAverage(aL));
        System.out.println("------------------------");
    }

    public static void printModeAndFreq (ArrayList<Integer> aL)
    {
            System.out.printf("Mode:%8d\n", aL.get(getModeIndex(aL)));
            System.out.printf("Frequency:%3d\n", countOccurrence(aL, getModeIndex(aL)));
    }

    public static void main (String[] args)
    {
        ArrayList<Integer> arrL = new ArrayList<>();
        Scanner scnr = new Scanner(System.in);

        String userInput = getInput(scnr);

        arrL = setArrayList(userInput);

        printHeader();

        printNumInts(arrL);
        printAscendingAL(arrL);

        printHighLowValues(arrL);
        printAverage(arrL);

        printModeAndFreq(arrL);
    }
}
