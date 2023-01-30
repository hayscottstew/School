public class GetDifference {

    public static double getDiff (double[] array)
    {
        double max = 0.0;
        double min = array[0];

        for (double value : array)
        {
            if (value > max)
            {
                max = value;
            }
        }

        for (double value : array)
        {
            if (value < min)
            {
                min = value;
            }
        }

        return max - min;
    }

    public static void main (String[] args)
    {
        double[] arr = {1.0, 2.0, 421.0};

        System.out.println("Difference between max n min: " + getDiff(arr));
    }

}
