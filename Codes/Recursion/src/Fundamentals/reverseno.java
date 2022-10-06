package Fundamentals;

public class reverseno {
    public static void main(String[] args) {
        System.out.println(reverse3(47382));
//        System.out.println(sum);
    }
//    One way of solving the problem of reversing a number
    static int sum=0;
    public static int reverse(int n){
        if(n/10 == n){
            return sum;
        }
        int rem = n%10;
        sum = sum*10 +rem;
        return reverse(n/10);
    }
//    Second way to reverse a number
    public static int reverse1(int n, int sum){
        if(n/10 == n){
            return sum;
        }
        int rem = n%10;
        sum = sum*10 +rem;
        return reverse1(n/10,sum);
    }
//    Third and the best way to implement it
    public static int reverse3(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }
    public static int helper(int n,int digits){
        if(n/10 == n){
            return n;
        }
        int rem =n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
