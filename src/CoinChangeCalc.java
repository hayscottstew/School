import java.util.Scanner;

public class CoinChangeCalc {

    public static void exactChange(int userTotal, int[] coinVals) {
        int numQ = (userTotal / 25); coinVals[3] = numQ;
        userTotal -= (25 * numQ);

        int numD = (userTotal / 10); coinVals[2] = numD;
        userTotal -= (10 * numD);

        int numN = (userTotal / 5); coinVals[1] = numN;
        userTotal -= (5 * numN);

        int numP = (userTotal / 1); coinVals[0] = numP;
        userTotal -= numP;
    }


    public static void main(String[] args) {
        int[] coins = new int[4];
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter amount of total change due (in cents): ");
        int change = scnr.nextInt();
        exactChange(change, coins);
        if (change > 0) {
            for (int i = 0; i < 4; i++) {
                if (i == 0 && coins[i] > 1) {
                    System.out.println(coins[i] + " pennies");
                }
                else if (i == 0 && coins[i] > 0) {
                    System.out.println(coins[i] + " penny");
                }
                if (i == 1 && coins[i] > 1) {
                    System.out.println(coins[i] + " nickels");
                }
                else if (i == 1 && coins[i] > 0) {
                    System.out.println(coins[i] + " nickel");
                }
                if (i == 2 && coins[i] > 1) {
                    System.out.println(coins[i] + " dimes");
                }
                else if (i == 2 && coins[i] > 0) {
                    System.out.println(coins[i] + " dime");
                }
                if (i == 3 && coins[i] > 1) {
                    System.out.println(coins[i] + " quarters");
                }
                else if (i == 3 && coins[i] > 0) {
                    System.out.println(coins[i] + " quarter");
                }
            }
        }
        else {
            System.out.println("no change");
        }
    }
}
