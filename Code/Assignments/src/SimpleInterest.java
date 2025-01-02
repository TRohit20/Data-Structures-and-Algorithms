import java.util.Scanner;
//Q. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal:");
        int principal = in.nextInt();
        System.out.println("Enter time:");
        int time = in.nextInt();
        System.out.println("Enter the interest rate:");
        int rate = in.nextInt();
        System.out.println(simpleinterest(principal,time,rate));
    }
    public static int simpleinterest(int p, int t, int r){
        int si = p* r * t;
        return si;
    }
}
