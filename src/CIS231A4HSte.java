/*
    @author Hayden Stewart
    CIS 231 Assignment 4 - Temperature Report
    Randy Scovil / Cuesta College
    Due Date: Nov. 2, 2022 @ 11:59pm
 */

import java.util.Scanner;

public class CIS231A4HSte
{
    //*** SORT & CALCULATION METHODS ***
    public static double findStandardDeviation (double[] n)
    {
        double summation = 0.0;
        double mean = findAverage(n);

        if (n.length > 1)
        {
            for (double i : n)
            {
                summation += Math.pow((i - mean), 2.0);
            }
            return Math.sqrt(summation / ((double) (n.length - 1)));
        }
        else
        {
            System.out.println("** Error Calculating Standard Deviation: Sample Size of 1 **");
            return 0.0;
        }
    }

    public static int findNumAboveAvg (double[] values)
    {
        int count = 0;

        for (double value : values)
        {
            if (value > findAverage(values))
            {
                ++count;
            }
        }
        return count;
    }

    public static int findNumEqualToAvg (double[] values)
    {
        int count = 0;

        for (double value : values)
        {
            if (value == findAverage(values))
            {
                ++count;
            }
        }
        return count;
    }

    public static int findNumBelowAvg (double[] values)
    {
        int count = 0;

        for (double value : values)
        {
            if (value < findAverage(values))
            {
                ++count;
            }
        }
        return count;
    }

    public static double findAverage (double[] values)
    {
        double sum = 0.0;
        for (double value : values)
        {
            sum += value;
        }
        return (sum / (double)values.length);
    }

    public static double findMinTemp (double[] values)
    {
        double min = values[0];

        for (double value : values)
        {
            if (value < min)
            {
                min = value;
            }
        }
        return min;
    }

    public static double findMaxTemp (double[] values)
    {
        double max = values[0];

        for (double value : values)
        {
            if (value > max)
            {
                max = value;
            }
        }
        return max;
    }

    public static void insertionSort (double[] values)
    {
        for (int i = 1; i < values.length; i++)
        {
            double temp = values[i];

            int j = i;

            for ( ; j > 0 && temp < values[j - 1]; j--)
            {
                values[j] = values[j - 1];
            }

            values[j] = temp;
        }
    }

    public static void fahrenheitToCelsius (double[] fVals, double[] celsiusVals)
    {
        final double CONVERSION_FACTOR = 32.0;

        for (int i = 0; i < fVals.length; i++)
        {
            celsiusVals[i] = (fVals[i] - CONVERSION_FACTOR) * (5.0 / 9.0);
        }
    }

    public static void fahrenheitToKelvin (double[] fVals, double[] kelvinVals)
    {
        final double CONVERSION_FACTOR = 459.67;

        for (int i = 0; i < fVals.length; i++)
        {
            kelvinVals[i] = (fVals[i] + CONVERSION_FACTOR) * (5.0 / 9.0);
        }
    }

    //*** PRINT METHODS ***
    public static void printHeader ()
    {
        String out = "CIS 231 - Assignment 4 - Hayden Stewart";
        System.out.printf("\n%50s\n", out);
        System.out.println();
    }

    public static void printTemperatures (double[] fVals, double[] celsiusVals, double[] kelvinVals)
    {
        String fahr = "Fahr";
        String cels = "Cels";
        String kelv = "Kelv";
        String div = "-----";

        System.out.printf("%24s", fahr);
        System.out.printf("%18s", cels);
        System.out.printf("%18s", kelv);
        System.out.println();

        System.out.printf("%24s", div);
        System.out.printf("%18s", div);
        System.out.printf("%18s", div);
        System.out.println();

        for (int i = 0; i < fVals.length; i++)
        {
            System.out.printf("%24.1f", fVals[i]);
            System.out.printf("%18.1f", celsiusVals[i]);
            System.out.printf("%18.1f", kelvinVals[i]);
            System.out.println();
        }
        System.out.printf("%24s", div);
        System.out.printf("%18s", div);
        System.out.printf("%18s", div);
        System.out.println();
    }

    public static void printAverage (double[] fVals, double[] celsiusVals, double[] kelvinVals)
    {
        System.out.printf("Average:%16.1f", findAverage(fVals));
        System.out.printf("%18.1f", findAverage(celsiusVals));
        System.out.printf("%18.1f\n\n", findAverage(kelvinVals));
    }

    public static void printHighLowVals (double[] fVals, double[] celsiusVals, double[] kelvinVals)
    {
        System.out.printf("High:%19.1f", findMaxTemp(fVals));
        System.out.printf("%18.1f", findMaxTemp(celsiusVals));
        System.out.printf("%18.1f\n\n", findMaxTemp(kelvinVals));

        System.out.printf("Low:%20.1f", findMinTemp(fVals));
        System.out.printf("%18.1f", findMinTemp(celsiusVals));
        System.out.printf("%18.1f\n\n", findMinTemp(kelvinVals));
    }

    public static void printAvgComparisonNums (double[] fVals)
    {
        System.out.printf("Above Average:%8d\n", findNumAboveAvg(fVals));
        System.out.printf("Equal to Average:%5d\n", findNumEqualToAvg(fVals));
        System.out.printf("Below Average:%8d\n\n", findNumBelowAvg(fVals));
    }

    public static void printSampleStandardDeviation (double[] fVals)
    {
        System.out.printf("Standard Deviation:%5.1f\n", findStandardDeviation(fVals));
    }

    //*** INPUT METHODS ***
    public static void getFahrenheitVals (double[] fVals, Scanner scnr)
    {
        final double MAX_FAHRENHEIT = 300.0;
        final double MIN_FAHRENHEIT = -150.0;

        for (int i = 0; i < fVals.length; i++)
        {
            System.out.println("Enter temperature value " + (i + 1) + " of " + fVals.length + ": ");
            fVals[i] = scnr.nextDouble();
            while (fVals[i] > MAX_FAHRENHEIT || fVals[i] < MIN_FAHRENHEIT)
            {
                System.out.println("Out of range! Enter a value between " + MIN_FAHRENHEIT + " and " + MAX_FAHRENHEIT + ":");
                fVals[i] = scnr.nextDouble();
            }
        }
    }

    public static int getNumInputs (Scanner scnr)
    {
        System.out.println("Enter # of inputs, between 1 & 35 (inclusive): ");
        int numInputs = scnr.nextInt();

        while (numInputs < 1 || numInputs > 35)
        {
            System.out.println("*Value out of range(1-35)*\nPlease enter new value: ");
            numInputs = scnr.nextInt();
        }
        return numInputs;
    }

    public static void main (String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int numInputs = getNumInputs(scnr);

        double[] fVals = new double[numInputs];
        double[] celsiusVals = new double[numInputs];
        double[] kelvinVals = new double[numInputs];

        getFahrenheitVals(fVals, scnr);
        fahrenheitToCelsius(fVals, celsiusVals);
        fahrenheitToKelvin(fVals, kelvinVals);

        insertionSort(fVals);
        insertionSort(celsiusVals);
        insertionSort(kelvinVals);

        printHeader();
        printTemperatures(fVals, celsiusVals, kelvinVals);
        printAverage(fVals, celsiusVals, kelvinVals);
        printHighLowVals(fVals, celsiusVals, kelvinVals);
        printAvgComparisonNums(fVals);
        printSampleStandardDeviation(fVals);
    }
}

