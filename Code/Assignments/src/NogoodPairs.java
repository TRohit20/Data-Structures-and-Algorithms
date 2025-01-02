//Q. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/
public class NogoodPairs {
    public static void main(String[] args) {

    }
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int j =1;
            while(j < nums.length){
                if(nums[i] == nums[j] && i<j){
                    count++;
                }
                j++;
            }
        }
        return count;
    }
}
