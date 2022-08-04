import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayTest
{

    @Test
    void bubbleSort()
    {
        int[] intArray = new int[]{ 5,4,7,9,1,0};
        ArraysUtils.bubbleSort(intArray);
        Assertions.assertTrue(ArraysUtils.isSorted(intArray));
    }

    @Test
    void binarySearch()
    {
        int[] intArray = new int[]{ 3, 6, 7, 8, 10, 11};
        Assertions.assertEquals(2, ArraysUtils.binarySearch(intArray, 7));
        Assertions.assertEquals(-1, ArraysUtils.binarySearch(intArray, 17));
    }
}