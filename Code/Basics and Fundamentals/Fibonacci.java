import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int n=in.nextInt();
            fibonacci(n);
        }
    }
    static void fibonacci(int n){
        int n1=0,n2=1,n3;
        for(int i=2;i<n;++i){
            n3=n1+n2;
            System.out.println(+n3);
            n1=n2;
            n2=n3;
        }
    }
}
