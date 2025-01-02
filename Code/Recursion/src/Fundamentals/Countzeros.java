package Fundamentals;

public class Countzeros {
    public static void main(String[] args) {
        System.out.println(zeros(10101000));
        System.out.println(zero(101010000));
    }
//    One way to solve the problem
    static int count=0;
    public static int zeros(int n){
        if(n/10 == n){
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        return zeros(n/10);
    }
//    Second way to solve the problem
    public static int zero(int n){
        return helper(n,0);
    }
    public static int helper(int n, int count1){
        if(n/10 == n){
            return count1;
        }
        if(n%10 == 0){
            count1++;
        }
        return helper(n/10,count1);
    }
}
