import java.util.Scanner;
//Q. Input a year and find whether it is a leap year or not.
public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = in.nextInt();
//        Any year that is linearly divisible by 4 is a leap year.
        if(year % 4 == 0){
            System.out.println("Given year is a Leap Year");
        } else{
            System.out.println("Given is not a Leap year");
        }
    }
}