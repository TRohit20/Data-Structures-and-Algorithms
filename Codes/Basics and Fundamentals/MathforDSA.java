import java.util.Scanner;

public class MathforDSA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(isOdd(n));
        int[] nums={3,3,2,1,2,4,4};
        System.out.println(unique(nums));
    }
//  Q1.  Function to check if N is even or odd
    public static boolean isOdd(int n){
//        Performing and operation with just 1
        return (n & 1) ==1;
    }
//    Q2. Function to get the only number that does not repeat twice in an array:
    public static int unique(int[] nums){
        int unique=0;
        for(int i=0; i<nums.length;i++){
            unique ^= nums[i];
        }
        return unique;
    }
}
