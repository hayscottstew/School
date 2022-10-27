import java.util.Scanner;


public class IntegerCheck {

   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in); //not required for study guide
      System.out.print("Enter an integer: "); //not required for study guide
      int x = scnr.nextInt(); //not required for study guide

      if (x < 0) {
         System.out.println("Invalid");
      }
      else if (x > 49 && x < 80) {
         System.out.println("Ineligible receiver");
      }
      else if (x > 99) {
         System.out.println("Invalid");
      }
      else {
         System.out.println("Eligible receiver");
      }








   }



}
