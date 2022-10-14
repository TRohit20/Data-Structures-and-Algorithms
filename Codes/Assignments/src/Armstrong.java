import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to be checked if armstrong or not:");
        int num = in.nextInt();

        if(armstrong(num)){
            System.out.println("Given is an Armstrong number");
        } else{
            System.out.println("Given is not an Armstrong number");
        }

    }
    public static boolean armstrong(int num){
        int temp, digits=0, last, sum=0;
//      Assigning n into a temp variable
        temp=num;
//        Loop to get the count of digits in the given number
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
//        Loop to find each digit to digits power and sum of them all
        temp = num;
        while(temp>0)
        {
//      Determines the last digit from the number
            last = temp % 10;
//      Calculates the power of a number up to digit times and add the resultant to the sum variable
            sum +=  (Math.pow(last, digits));
//      Removes the last digit
            temp = temp/10;
        }
//        Above loop violated means, the sum of the digits to digits power is obtained
//      compares the sum with number to check if it is armstrong or no
        //      Returns if sum and num are equal
        //      Returns false if sum and num are not equal
        return num == sum;
    }
}
