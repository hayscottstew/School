public class OddEvenChecker {

   public static int evenOrOdd (int loneInt) {
      if (loneInt % 2 == 1) {
         return 1;
      }
      return 0;
   }

   public static void main (String[] args) {

      int value = 41;

      int answer = evenOrOdd(value);

      System.out.println("" + answer);


   }



}
