import java.util.Arrays;
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
//        System.out.println(a.equals(b));
        prettyprinting();
        Operators();
        Methods();
    }
//    Function contains some methods provided to String class in java
    public static void Methods(){
        String name= "Rohit King";
//        Some functions we can perform on strings are:
//        Syntax: reference_variable.method();
//        tocharArray converts it to a char array:
        System.out.println(Arrays.toString(name.toCharArray()));
//        To convert all to uppercase:
        System.out.println(name.toUpperCase());
//        to convert all chars to lowercase:
        System.out.println(name.toLowerCase());
//        To replace a char with another:
        System.out.println(name.replace('i','o'));
//        To remove the extra white spaces:
//        System.out.println(name.strip());
//        To split into sub-array using a space or a char you give:
        System.out.println(Arrays.toString(name.split("t")));
//        To check the index of a char:
        System.out.println(name.indexOf('t'));
    }

//    Function contains how to pretty print nos or strings
    public static void prettyprinting(){
        float a = 432.23452f;
        double b= 234.23432;
//        Way to pretty print or format the number
        System.out.printf("Formatted Number would be: %.1f",a);
//        Based on placing of placeholders values are shown.
//        Math is a class in java in which value of pi is pre-defined or inbuilt, so we are just accessing it
        System.out.printf("Formatted numbers would be: %.3f and %.2f and %.1f",b,a,Math.PI);
    }
//    Function contains about + operator in java
    public static void Operators(){
//        + Operator
//        char is given in single quote, adding them will give us integer
        System.out.println('a'+'b');
//        Adding two strings will lead to concatenation like below:
        System.out.println("a"+"b");
//        If we add a char with an integer: it gives us an integer:
        System.out.println('a'+7);
//        You can convert both the expression above and get a char result by casting:
//        Syntax: (data_type to cast)(expression)
        System.out.println((char)('a'+7));
//        if we add a string with integer we get: string concatenated with an integer
        System.out.println("a"+7);
//        NOTE: '+' Operator in Java can only be used when there is atleast one string in the expression:
        System.out.println("a"+'b'+32);
    }
}
