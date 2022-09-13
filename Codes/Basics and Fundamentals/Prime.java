import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number to be checked:");
            int n=in.nextInt();
            if(checkforprime(n)){
                System.out.println("The given number is a Prime number ");
            }else{
                System.out.println("The given number is a Composite Number");
            }
        }
    }
    static Boolean checkforprime(int n){
        if(n<=0||n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}