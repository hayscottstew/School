import java.awt.*;

public class MidTermPractice {
   public static void main(String[] args) {

      Point [] myPoints = new Point[3];

      for (int i = 0; i < 3; i++) {
        myPoints[i] = new Point(i, i);
   }
      for (int i = 0; i < 3; i++) {

         System.out.println("Point " + i + ":");
         System.out.printf("X- %.2f Y- %.2f\n", myPoints[i].getX(), myPoints[i].getY());

      }






   }

}
