//import java.util.Scanner;
//Q. Check if the Sentence Is Pangram
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class Pangram {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        String sequence = "thequickbrownfoxjumpsoverthelazydog";
        if(checkIfPangram(sequence)){
            System.out.println("Given is a Pangram");
        } else{
            System.out.println("Given is not a pangram");
        }
    }
    public static boolean checkIfPangram(String sentence) {
        boolean[] arr=new boolean[26];
        for(char ch:sentence.toCharArray()){
            int idx=(ch-'a');
            arr[idx]=true;
        }

        for(boolean val:arr){
            if(!val) return false;
        }
        return true;
    }
}
