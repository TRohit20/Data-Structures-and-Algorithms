import java.util.Scanner;

public class Tempconv {
    
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the temperature in celsius:");
            Float celsius= in.nextFloat();
            Float fahrenheit=(celsius*9/5)+32;
            System.out.println("The temperature in Fahrenheit is:"+fahrenheit);
        }
    }
}
