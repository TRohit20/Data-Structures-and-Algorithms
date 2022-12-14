import java.util.Scanner;

public class MathforDSA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(isOdd(n));
        int[] nums={3,3,2,1,2,4,4};
        int[] nums1={-3,3,1,-1,0};
        System.out.println(unique(nums));
        System.out.println(Unique(nums1));
        System.out.println(findi(10232));
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
//    Q3. Given an array with nos of both +ve and -ve find the unique number
    public static int Unique(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }
//    Q4. Given a number, find it's ith bit:
    public static int findi(int n){
        return n & (1 << n-1);
    }
}
