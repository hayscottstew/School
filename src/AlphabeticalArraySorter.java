import java.util.Arrays;

public class AlphabeticalArraySorter {

    public String getFirstAlphabeticalStr (String[] array)
    {
        Arrays.sort(array);

        String s = array[0];
        return s;
    }

    public static void main(String[] args) {
        String[] arr = {"These", "Nuggets", "Are", "Absolute"};

        //System.out.println(getFirstAlphabeticalStr(arr));
        String one = "Balls";
        String two = "Balla";
        double[] result = new double[0];

        int count = 0;

        for (int i = 0; i < one.length(); i++) {

        if (one.substring(i, i + 1).equals(two.substring(i, i + 1))) {

            count += 1;
        }

        }

        System.out.println(count);


    }

}

