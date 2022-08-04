public class ArraysUtils
{
    public static void bubbleSort(int[] input) {
        /*
        BUBBLESORT(A, n)
        1 for i = 1 to n – 1
        2 for j = n downto i + 1
        3 if A[j] < A[j – 1]
        4 exchange A[j] with A[j – 1]”
        */
        for(int i=0; i<input.length; i++){
            for(int j=input.length-1; j>i ; j--) {
                if(input[i]> input[j])  {
                    input[i] = input[i] + input[j];
                    input[j] = input[i] - input[j];
                    input[i] = input[i] - input[j];
                }
            }
        }
    }

    public static boolean isSorted(int[] intArray)
    {
        for(int i=0; i< intArray.length - 1; i++)
            if(intArray[i] > intArray[i+1])
                return false;
        return true;
    }
}
