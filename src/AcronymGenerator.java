import java.util.*;
import java.lang.*;

public class AcronymGenerator {

    public static String createAcronym(String userPhrase) {
        StringBuilder acronym = new StringBuilder();
        //breaks phrase into words between spaces
        String[] strArr = userPhrase.split(" ");

        for (String word : strArr) {
            //branch checks ACSII values for capital letters
            if (word.charAt(0) > 64 && word.charAt(0) < 91 ) {
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

