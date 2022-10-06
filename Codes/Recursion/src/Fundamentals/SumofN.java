package Fundamentals;

public class SumofN {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }
//    Function to get the sum of N numbers
    public static int sum(int n){
//        Base Condition
//        Assuming we only take positive numbers
        if(n <= 0){
            return 0;
        }
        return n + sum(n-1);
    }
}
