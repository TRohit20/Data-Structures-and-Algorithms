import java.util.Scanner;
//Q. Write a function that returns all prime numbers between two given numbers.
public class AllPrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range:");
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i=start;i<=end;i++){
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime (int n)
    {
//        int count = 0;

        // 0, 1 negative numbers are not prime
        if (n < 2)
            return false;

        // checking the number of divisors b/w 1 and the number n-1
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return false;
        }

        // if reached here then must be true
        return true;
    }

}
