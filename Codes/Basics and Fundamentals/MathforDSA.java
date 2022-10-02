import java.util.Scanner;

public class MathforDSA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(isOdd(n));
    }
//  Q1.  Function to check if N is even or odd
    public static boolean isOdd(int n){
//        Performing and operation with just 1
        return (n & 1) ==1;
    }
}
