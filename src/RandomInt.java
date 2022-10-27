import java.util.*;

public class RandomInt {

   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random();

      final int MIN = -100;

      final int MAX = 100;

      int r1 = rand.nextInt( MAX + 1 - MIN) + MIN;

      int r2 = rand.nextInt( MAX + 1 - MIN) + MIN;

      if (r1 > r2) {

      System.out.println("" + r1 + " is greater than " + r2);

      }

      else if (r1 < r2) {

      System.out.println("" + r2 + " is greater than " + r1);

      }

      else {

         System.out.println("" + r1 + " is equal to " + r2);

      }
















   }
}
