package Arrays.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

    }
//    Function to divide and conquer the array for sorting
    public static void mergesort(int[] arr){
//        Base condition
        if( arr.length == 1){
            return;
        }
        int mid = arr.length/2;

        int[] arr1 = mergesort(Arrays.copyOfRange(arr,0,mid));

    }
}
