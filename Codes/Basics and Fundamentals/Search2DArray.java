import java.util.Arrays;
import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr={
                {23,45},
                {32,12,23,78,9},
                {77,88,99}
        };
        System.out.println("Enter element to be searched:");
        int target=in.nextInt();
//        to return the answer row and col as an array ==> (rol,col)
        int[] ans=search(arr,target);
//        SInce printing an array
        System.out.println(Arrays.toString((ans)));
    }
    public static int[] search(int[][] arr,int target){

        for(int row=0;row<arr.length;row++){
//            search for each row and each element in that row
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
//                    can initialise new array like this
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
