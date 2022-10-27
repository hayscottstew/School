import java.lang.*;
import java.util.*;

public class BinaryConversion {

    public static String intToReverseBinary(int integerValue) {
        String output = "";
        while (integerValue > 0) {
            output += integerValue % 2;
            integerValue /= 2;
        }
        return output;
    }
    public static String stringReverse(String inputString) {
        StringBuilder nStr = new StringBuilder();
        nStr.append(inputString);
        nStr.reverse();
        inputString = nStr.toString();
        return inputString;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = scnr.nextInt();

        System.out.println(stringReverse(intToReverseBinary(userInt)));

    }
}

