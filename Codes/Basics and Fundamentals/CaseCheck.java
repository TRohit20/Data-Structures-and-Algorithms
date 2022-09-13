import java.util.Scanner;

public class CaseCheck{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a letter:");
            char ch= in.next().trim().charAt(0);
            System.out.println(ch);
            if(ch>='a' && ch<='z'){
                System.out.println("The character is lowercase.");
            }else{
                System.out.println("the character is Uppercase");
            }
        }
        }
    }
