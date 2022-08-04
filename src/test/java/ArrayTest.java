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
}