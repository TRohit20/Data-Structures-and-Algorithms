import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the numeber:");
            int n=in.nextInt();
            int factorial=1;
            for(int i=1;i<=n;i++){
                factorial=factorial*i;
            }

        System.out.println("The factorial of the given number is:"+factorial);
        }
    }
}
