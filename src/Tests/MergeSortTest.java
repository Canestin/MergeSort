package Tests;
import MS.MergeSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {
    MergeSort MS;

    @BeforeEach
    void setUp() {
        MergeSort MS = new MergeSort();
    }

    @Test
    public void testMergeSortEmptyArray() {
        int[] tableau = {};
        MS.mergeSort(tableau);
        assertArrayEquals(new int[] {}, tableau);
    }

    @Test
    public void testMergeSortSingleElementArray() {
        int[] tableau = {42};
        MS.mergeSort(tableau);
        assertArrayEquals(new int[] {42}, tableau);
    }

    @Test
    public void testMergeSortTwoElementArray() {
        int[] tableau = {42, 23};
        MS.mergeSort(tableau);
        assertArrayEquals(new int[] {23, 42}, tableau);
    }

    @Test
    public void testMergeSortOddLengthArray() {
        int[] tableau = {38, 27, 43, 3, 9, 82, 10};
        MS.mergeSort(tableau);
        assertArrayEquals(new int[] {3, 9, 10, 27, 38, 43, 82}, tableau);
    }

    @Test
    public void testMergeSortEvenLengthArray() {
        int[] tableau = {38, 27, 43, 3, 9, 82, 10, 91};
        MS.mergeSort(tableau);
        assertArrayEquals(new int[] {3, 9, 10, 27, 38, 43, 82, 91}, tableau);
    }
}
