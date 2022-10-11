package Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
//        selection(arr,arr.length,0,0);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(selection1(arr,arr.length,0,0)));
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
//            Swap the max element with its correct position
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
//            Recursive call
            selection(arr, row-1, 0, 0);
        }
    }
    public static int[] selection1(int[] arr, int row, int col, int max) {
//        Base condition
        if (row == 0) {
            return arr;
        }
//        For each pass
        if (col < row) {
//            Finding max element
            if (arr[col] > arr[max]) {
                return selection1(arr, row, col+1, col);
            } else {
                return selection1(arr, row, col+1, max);
            }
        }
//        After searching the whole array for once, and getting the max element
        else {
//            Swap the max element with its correct position
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
//            Recursive call
            return selection1(arr, row-1, 0, 0);
        }
    }
}
