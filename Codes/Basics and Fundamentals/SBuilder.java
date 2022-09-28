import java.util.Scanner;

//                          String Builder
// Whe do we use String builder?
//We use string builders to modify the object without creating new objects or copy of previous objects
// This leads to saving a lot of memory and increases the performance when compared to copying the object and appending the change to it
// The Class StringBuilder has many in-built functions or methods to it demonstrated below:
public class SBuilder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Syntax for String Builder: StringBuilder reference_variable_name = new StringBuilder();
        StringBuilder alphabets= new StringBuilder();
        for(int i =0; i<26;i++){
            char ch= (char)('a'+i);
            alphabets.append(ch);
        }
//        One way to print above series would be:
//        for(int i=0;i<26;i++){
//            String alphabet="";  // Currently Null
//            char ch = (char)('a'+i);
//            alphabet += ch;
//            System.out.print(alphabet);
//        }
//        System.out.println();
//        Some methods of String or StringBuilder are:
//        There are many that we can use:
        alphabets.deleteCharAt(25);
        System.out.println(alphabets.indexOf("m"));
        System.out.println(alphabets.reverse());
        System.out.println(alphabets);
        alphabets.delete(0,12);
        System.out.println(alphabets);
    }
}
