import java.util.Scanner;
//Q. Take two numbers and print the sum of both
public class SumofInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter inputs to be added:");
//        Initialising the count of input
        int i =1;
        int sum =0;
//        You can use For loop too, and many other ways without using loops.
        while(i <= 2){
            int num1 = in.nextInt();
            sum += num1;
            i++;
        }
        System.out.println(sum);
    }
}
