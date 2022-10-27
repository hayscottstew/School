import java.util.Scanner;

public class LeapYears {

    public static int daysInFeb(int userYear) {
        int febDays = 28;
        if (userYear % 4 == 0) {
            if (userYear % 100 == 0) {
                if (userYear % 400 == 0) {
                    febDays = 29;
                }
            }
            else {
                febDays = 29;
            }
        }
        return febDays;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int year = scnr.nextInt();

        System.out.println(year + " has " + daysInFeb(year) + " days in February.");
    }
}
