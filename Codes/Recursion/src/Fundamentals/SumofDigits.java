package Fundamentals;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(digitsum(9876));
    }
//    Function to get the Sum of Digits of a number
    public static int digitsum(int n){
//        Base condition
        if(n==0){
            return 0;
        }
//        Recurrence relation
        return n%10 + digitsum(n/10);
    }
}
