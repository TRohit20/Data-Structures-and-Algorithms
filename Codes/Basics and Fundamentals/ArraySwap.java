import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        swap(nums, 1,3);

    }
    public static void swap(int[] nums,int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        System.out.println("The new array after swap:"+ Arrays.toString(nums));

    }
}
