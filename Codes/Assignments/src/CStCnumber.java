//Q. How Many Numbers Are Smaller Than the Current Number
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class CStCnumber {
    public static void main(String[] args) {

    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            int count=0;
            for(int j = 0; j<nums.length;j++){
                if(nums[i]>nums[j] && j!=i){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
