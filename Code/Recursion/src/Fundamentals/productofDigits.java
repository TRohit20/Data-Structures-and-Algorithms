package Fundamentals;

public class productofDigits {
    public static void main(String[] args) {
        System.out.println(product(2304));
    }
//    Function to get the product of Digits of a number given
    public static int product(int n){
//        Base condition
//        0*anything is 0 so we do this
        if(n%10 == n){
            return 1;
        }
//        recurrence relation
        return n%10 * product(n/10);
    }
}
