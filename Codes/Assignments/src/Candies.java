import java.util.ArrayList;

//Q. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class Candies {
    public static void main(String[] args) {

    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = -1;
        for(int i = 0; i< candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length ;i++){
            result.add(candies[i]+ extraCandies >= max);
        }
        return result;
    }
}
