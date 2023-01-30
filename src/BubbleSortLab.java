import java.util.Scanner;

public class BubbleSortLab {
    static int i = 0; static int j = 0; static int temp = 0;
    public static void ascendingSort(int[] myArr, int arrSize)
    {
        for (i = 0; i < arrSize; i++)
        {
            for (j = 0; j < arrSize - i - 1; j++)
            {
                if (myArr[j] > myArr[j + 1])
                {
                    temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
    }
    public static void descendingSort(int[] myArr, int arrSize)
    {
        for (i = 0; i < arrSize; i++)
        {
            for (j = 0; j < arrSize - i - 1; j++)
            {
                if (myArr[j] < myArr[j + 1])
                {
                    temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int size = scnr.nextInt();
        int i;
        int nums[] = new int[size];
        for (i = 0; i < size; i++) {
            nums[i] = scnr.nextInt();
        }
        descendingSort(nums, size);
        for (i = 0; i < size; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        ascendingSort(nums, size);
        for (i = 0; i < size; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
    }
}
