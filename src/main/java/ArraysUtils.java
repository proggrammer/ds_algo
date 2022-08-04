public class ArraysUtils
{
    public static void bubbleSort(int[] input)
    {
        for (int i = 0; i < input.length; i++)
            for (int j = input.length - 1; j > i; j--)
                if (input[i] > input[j])
                {
                    input[i] = input[i] + input[j];
                    input[j] = input[i] - input[j];
                    input[i] = input[i] - input[j];
                }
    }

    public static boolean isSorted(int[] intArray)
    {
        for (int i = 0; i < intArray.length - 1; i++)
            if (intArray[i] > intArray[i + 1]) return false;
        return true;
    }

    public static int binarySearch(int[] intArray, int value)
    {
        int l = 0, r = intArray.length-1;
        while (l <= r)
        {
            int m = l + (r - 1) / 2;
            if (intArray[m] == value) return m;
            if (intArray[m] < value) l = m+1;
            else r = m-1;
        }
        return -1;
    }
}
