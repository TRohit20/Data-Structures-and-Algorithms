import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
     
    try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter the string to be checked:");
        String word=in.nextLine();
        if(checkforpalindrome(word)==true){
            System.out.println("The given is a Palindrome. ");
        }else{
            System.out.println("The given is not a Palindrome");
        }
    }
    }
    static Boolean checkforpalindrome(String word){
        int left=0;
        int right=word.length()-1;
        while(word.charAt(left)<word.charAt(right)){
            if(left!=right){
                return false;
            }
        }
        return true;
    }
}
