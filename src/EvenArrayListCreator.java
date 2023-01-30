import java.util.ArrayList;

public class EvenArrayListCreator {

    public static ArrayList<Integer> getArrayOfEvens(int[] arr)
    {
        ArrayList<Integer> evenArrayList = new ArrayList<Integer>();

        for (int val : arr)
        {
            if (val % 2 == 0)
            {
                evenArrayList.add(val);
            }
        }

        return evenArrayList;
    }

    public static void main (String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(getArrayOfEvens(array));

    }

}
