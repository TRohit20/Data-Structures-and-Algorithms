package Fundamentals;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
//    Function to get the factorial of a number
    public static int factorial(int n){
//        Base Condition
        if(n<=1){
            return 1;
        }
//        Recurrence relation for the problem to get factorial
        return n * factorial(n-1);
    }
}
