import java.util.Scanner;
//Q. Input currency in rupees and output in USD
public class UsdtoInr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in INR:");
        int inr = in.nextInt();
        double usd = inr * 0.012;
        System.out.println(usd);
    }
}
