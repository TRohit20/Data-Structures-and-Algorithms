import java.util.Scanner;

public class FibonacciwRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find it's Fibonacci number:");
        int n=in.nextInt();
        int ans= fibonacci(n);
        System.out.println(fibo(n));
    }
    public static int fibonacci(int n){
//        Base Condition
        if(n < 2){
            return n;
        }
//        Calling the function itself
        return fibonacci(n-1) + fibonacci(n-2);
    }
//    Way to solve fibonacci without recursion alos:
//    Just solve the recurrence relation and get the formula and use it:
    public static int fibo(int n){
        return (int)(Math.pow((1+ Math.sqrt(5))/2,n) );
    }
}
