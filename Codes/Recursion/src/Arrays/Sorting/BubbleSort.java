package Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1,0};
    }
//    Function to perform bubble sort using recursion
    public static void bubblesort(int[] arr,int row, int col){
//        Base condition
        if(row == 0){
            return;
        }
        if( col < row){
            if(arr[col] < arr[col+1]){
//                Swap the elements
                int temp = arr[col];
                arr[col]=arr[col+1];
                arr[col+1] = temp;
            }
            bubblesort(arr,row,col+1);
        } else{
            bubblesort(arr,row-1,0);
        }
    }
}
