import java.util.Scanner;
//Q. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class InputOp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Enter Operator:");
        char operator = in.next().charAt(0);
        int value;
        if( operator == '+'){
            value = num1 + num2;
            System.out.println(value);
        } else if( operator == '-'){
            value = num1 - num2;
            System.out.println(value);
        } else if( operator == '*'){
            value = num1 * num2;
            System.out.println(value);
        } else if( operator == '/'){
            value = num1 / num2;
            System.out.println(value);
        }
    }
}
