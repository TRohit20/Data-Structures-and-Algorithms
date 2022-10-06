package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums={32,45,66,78,93,102,333};
        System.out.println("Enter target element to search for:");
        int target=in.nextInt();
        int ans= search(nums,target,0,nums.length-1);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target,int start,int end){
        while(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return search(nums,target,start,mid-1);
        }
        return search(nums,target,mid+1,end);
    }
}
