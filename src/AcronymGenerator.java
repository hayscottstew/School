import java.util.*;
import java.lang.*;

public class AcronymGenerator {

    public static String createAcronym(String userPhrase) {
        StringBuilder acronym = new StringBuilder();

        String[] strArr = userPhrase.split(" "); //breaks phrase into words between spaces

        for (String word : strArr) {
            if (word.charAt(0) > 64 && word.charAt(0) < 91 ) { //checks ACSII values for A-Z(capital letters)
                acronym.append(word.charAt(0));
                acronym.append(".");
            }
        }
        return acronym.toString();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String userStr = scnr.nextLine();

        System.out.println(createAcronym(userStr));
    }
}

