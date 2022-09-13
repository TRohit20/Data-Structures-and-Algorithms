import java.util.Scanner;

public class MaximumItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] nums={1,2,3,4,5,6};
        int[] nums= new int[7];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<nums.length;i++){
            nums[i]=in.nextInt();
        }

        System.out.println(maxrange(nums,1,4));

    }
//    Function to find maximum value in a certain range:
    public static int maxrange(int[] nums,int index1,int index2){
        int max=nums[index1];
        for(int i= index1;i<index2;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public static int max(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    }

