import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter few Numbers");
            int a= in.nextInt();
            int b=in.nextInt();
            int c= in.nextInt();
            System.out.println(largestnumber(a, b, c));
        }
    }
    public static int largestnumber(int a,int b,int c){
        int largest=0;
        if(a>b && a>c){
            largest=a;
            // System.out.println("A is the Largest number of given.");
        }
        if(b>c && b>a){
            largest=b;
            // System.out.println("B is the Largest number of the given.");
        }
        if(c>a && c>b){
            largest=c;
            // System.out.println("C is the Largest Number of the given");
        }
        return largest;
    }
}
