import java.util.Scanner;
//Q. Take a number as input and print the multiplication table for it.
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for whose table you want:");
        int num = in.nextInt();
//        This is one approach
        int i = 0;
        int product;
        while(i <=10){
            product = num*i;
            System.out.println(product);
            i++;
        }
//        Another approach could be
        for(int j =0; j<=10;j++){
            product = num *j;
            System.out.println(product);
        }
    }
}
