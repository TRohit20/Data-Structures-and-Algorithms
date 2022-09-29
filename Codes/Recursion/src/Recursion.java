public class  Recursion{
    public static void main(String[] args) {
//        This is a file that shows why and how we can use Recursion
        numbers(1);
    }
//    Recursive function:
    public static void numbers(int n){

//        Base Condition to break the recursive call
        if(n==6){
            System.out.println(6);
            return;
        }
        System.out.println(n);
//        Recursion: A function calling itself.
        numbers(n+1);

    }
//    This is very redundant way of writing it or calling a function.
//    public static void numbers(int n){
//        System.out.println(1);
//        number1(n);
//    }
//    public static void number1(int n){
//        System.out.println(2);
//        number2(n);
//    }
//    public static void number2(int n){
//        System.out.println(3);
//        number3(n);
//    }
//    public static void number3(int n){
//        System.out.println(4);
//    }
}