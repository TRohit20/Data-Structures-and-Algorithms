import java.util.Scanner;
//Q. Take 2 numbers as inputs and find their HCF and LCM.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check:");
        int num = in.nextInt();
        if(num % 2 == 0) {
            System.out.println("Given is EVEN");
        } else{
            System.out.println("Given is ODD");
        }
    }
}
