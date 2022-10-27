public class RightTriangle {
   private double sideA;
   private double sideB;
   private double hyp;

   public RightTriangle(double A, double B) {
      sideA = A;
      sideB = B;
      hyp = Math.sqrt(Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0));
   }
   public RightTriangle (double sides) {
      sideA = sides;
      sideB = sides;
      hyp = Math.sqrt(Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0));
   }
   public RightTriangle() {
      sideA = 10.0;
      sideB = 10.0;
      hyp = Math.sqrt(Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0));
   }
   public double getSideA() {
      return sideA;
   }
   public double getSideB() {
      return sideB;
   }
   public double getHyp() {
      return hyp;
   }
   public String toString() {
      return "Side A = " + sideA + " Side B = " + sideB + " Hypotenuse = " + hyp + "\n";
   }

   public static void main(String[] args) {

      RightTriangle case1 = new RightTriangle(2.0, 2.0);
      RightTriangle case2 = new RightTriangle(5.0);
      RightTriangle case3 = new RightTriangle();

      System.out.print("" + case1 + case2 + case3);
   }
}
