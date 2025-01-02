import java.util.Scanner;

public class Occurence {
        // Program for Checking the occurence of a number in given number.

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a number to be checked for occurrence:");
            int num=in.nextInt();
            int c=in.nextInt();
            System.out.println(check(num, c));
       }

    }
     static int check(int num, int c){
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==c){
                count++;

            }
            num=num/10;
        }
        return count;

    }
}

// Program to check occurence of a char in given word
// public static void main(String[] args) {
//     try (Scanner in = new Scanner(System.in)) {
//         System.out.println("Enter a string and a character:");
//         String word= in.nextLine();
//         char ch = in.next().trim().charAt(0);
//         int count=0;
//         for(int i =0;i<word.charAt(i);i++){
//             if(word.charAt(i)==ch){
//                 count++;
//             }

//         }
// System.out.println("The number of the given character occurs in the given string is:"+count);
//     }
// }
// }