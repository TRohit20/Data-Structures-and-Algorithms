import java.util.Scanner;

public class FibonacciwRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find it's Fibonacci number:");
        int n=in.nextInt();
        int ans= fibonacci(n);
        System.out.println(ans);
    }
    public static int fibonacci(int n){
//        Base Condition
        if(n < 2){
            return n;
        }
//        Calling the function itself
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
