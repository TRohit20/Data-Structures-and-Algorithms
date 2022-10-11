package Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
//    Function to get the given Array sorted using the selection sort algorithm
    public static void selection(int[] arr, int row, int col, int max) {
//        Base condition
        if (row == 0) {
            return;
        }
//        For each pass
        if (col < row) {
//            Finding max element
            if (arr[col] > arr[max]) {
                selection(arr, row, col+1, col);
            } else {
                selection(arr, row, col+1, max);
            }
        }
//        After searching the whole array for once, and getting the max element
        else {
//            Swap the max element with it's correct position
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
//            Recursive call
            selection(arr, row-1, 0, 0);
        }
    }
}
