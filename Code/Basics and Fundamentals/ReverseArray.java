import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr=new int[6];
        System.out.println("Enter elements to be stored in the Array:");
        for(int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverse(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
        return nums;
    }
    public static int[] swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

        return nums;
    }
}
