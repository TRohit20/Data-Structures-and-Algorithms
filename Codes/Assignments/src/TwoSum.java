import java.util.Arrays;

//Q.
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
//    One approach
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int j = 1;
            while(j<nums.length){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
