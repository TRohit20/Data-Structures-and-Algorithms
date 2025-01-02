import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        initialise array
        int[] nums= new int[6];
//        to take input for array
        for(int i =0;i<nums.length;i++){
            nums[i]= in.nextInt();
        }

        int answer=evendigits(nums);
        System.out.println(answer);
    }
//    Function to get number of even numbers present in array
    public static int evendigits(int[] nums){
        if(nums.length==0){
            return -1;

        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])==true){
                count++;
            }
        }
        return count;
    }
//    Function to check if the number in array is even digit
    public static boolean even(int num){
        return digits(num)%2==0;
    }
//    Function to check the number of digits in a number
//    public static int digits(int num){
//        int count=0;
//        while(num>0){
//            count++;
//            num/=10;
//        }
//        return count;
//    }
//    Enhanced and easy way of finding the number of digits in a Array
    public static int digits(int num){
        return (int)(Math.log10(num))+1;
    }
}