import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        When two reference variables point to the same value or object
        String name="Rohit";
        String name2="Rohit";
//        Checking if it's true
//        You can check that in two ways:
//        (I). Using the '==' comparator operator.
        System.out.println(name == name2);
//        (II). Using the .equals() method
        System.out.println(name.equals(name2));
//        Here's how you can create two objects of the same value
        String a=new String("Rohit");
        String b=new String("Rohit");
//        By doing this, these objects while having the same value are created differently
//        And are stored outside the string pool
        System.out.println(a.equals(b));
        prettyprinting();
    }
    public static void prettyprinting(){
        float a = 432.23452f;
        System.out.println("Formatted Number would be ");
    }
}
