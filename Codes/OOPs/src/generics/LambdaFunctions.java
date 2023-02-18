package generics;

import interfaces.extendsDemo.A;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> lol = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            lol.add(i *2);
        }

//        'Items' is parameter and 'sout' is the body of the function
        lol.forEach((items) -> System.out.println(items * 2));

//        Another implementation of above can be
        Consumer<Integer> random = (items) -> System.out.println(items * 2);
        lol.forEach(random);

//        A way to store your lambda functions
        Operations sum = (a,b) -> a + b;
        Operations sub = (a,b) -> a - b;

        LambdaFunctions example = new LambdaFunctions();
        System.out.println(example.ops(4, 10, sub));
    }

//    Let's say you want multiple parameters? Create a interface as it'll contain abstract methods only
    public interface Operations{
//        You can't have more than one method
        int operate(int a, int b);
    }

//    A way to call your lambda functions
    private int ops(int a, int b, Operations op){
        return op.operate(a,b);
    }
}
