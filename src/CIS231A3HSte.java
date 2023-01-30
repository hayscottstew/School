/*

   @author Hayden Stewart
   CIS 231 - Assignment 3 - Temperature Conversions
   Cuesta College - Randy Scovil - due on 09/09/2022

 */

import java.util.Scanner;

public class CIS231A3HSte
{
   public static final double CELSIUS_MODIFIER = 32.0;
   public static final double KELVIN_MODIFIER = 459.67;
   public static final double FIVE_NINTHS = 5.0 / 9.0;
   public static final double NINE_FIFTHS = 9.0 / 5.0;

   public static double fahrenheitToCelsius (double f)
   {
      return (f - CELSIUS_MODIFIER) * (FIVE_NINTHS);
   }
   public static double fahrenheitToKelvin (double f)
   {
      return (f + KELVIN_MODIFIER) * (FIVE_NINTHS);
   }
   public static double kelvinToF (double k)
   {
      return ((k * (NINE_FIFTHS)) - KELVIN_MODIFIER);
   }
   public static void main(String[] args)
   {
      //Store Fahrenheit input values
      double tempF_1;
      double tempF_2;
      double tempF_3;

      Scanner scnr = new Scanner(System.in);
      System.out.println("Please input 3 fahrenheit temperatures below, pressing return/enter after each: ");

      tempF_1 = scnr.nextDouble();
      tempF_2 = scnr.nextDouble();
      tempF_3 = scnr.nextDouble();
      System.out.println();

      //Assign variables with Kelvin value by calling fahrenheitToK for each new input value
      double tempK_1 = fahrenheitToKelvin(tempF_1);
      double tempK_2 = fahrenheitToKelvin(tempF_2);
      double tempK_3 = fahrenheitToKelvin(tempF_3);

      //Print labelled output for conversion of input temp. 1
      System.out.printf("Your 1st input: %.2f Fahrenheit ", tempF_1);
      System.out.printf("is %.2f degrees Celsius.", fahrenheitToCelsius(tempF_1));
      System.out.printf(" Or, %.2f degrees in Kelvin.", fahrenheitToKelvin(tempF_1));
      System.out.printf(" Converted back to Fahrenheit from Kelvin is %.2f degrees F.\n\n", kelvinToF(tempK_1));

      //Print labelled output for conversion of input temp. 2
      System.out.printf("Your 2nd input: %.2f Fahrenheit ", tempF_2);
      System.out.printf("is %.2f degrees Celsius.", fahrenheitToCelsius(tempF_2));
      System.out.printf(" Or, %.2f degrees in Kelvin.", fahrenheitToKelvin(tempF_2));
      System.out.printf(" Converted back to Fahrenheit from Kelvin is %.2f degrees F.\n\n", kelvinToF(tempK_2));

      //Print labelled output for conversion of input temp. 3
      System.out.printf("Your 3rd input: %.2f Fahrenheit ", tempF_3);
      System.out.printf("is %.2f degrees Celsius.", fahrenheitToCelsius(tempF_3));
      System.out.printf(" Or, %.2f degrees in Kelvin.", fahrenheitToKelvin(tempF_3));
      System.out.printf(" Converted back to Fahrenheit from Kelvin is %.2f degrees F.\n", kelvinToF(tempK_3));
   }
}


