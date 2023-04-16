import MS.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 15, 2, 8, 34, 7, 11, 83, 6 };
        MergeSort MS = new MergeSort();
        MS.mergeSort(arr);
        System.out.print("| ");
        for (int i : arr) {
            System.out.print(i + " | ");
        }
    }
}