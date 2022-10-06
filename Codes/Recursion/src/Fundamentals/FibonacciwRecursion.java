package Fundamentals;

import java.util.Scanner;

public class FibonacciwRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find it's Fibonacci number:");
        int n=in.nextInt();
        int ans= fibonacci(n);
//        for(int i=0;i<13;i++){
//            System.out.println(fiboFormula(i));
//        }
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
//    Way to solve fibonacci without recursion alos:
//    Just solve the recurrence relation and get the formula and use it:
    public static long fiboFormula(int n){
    return  (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
}
}
