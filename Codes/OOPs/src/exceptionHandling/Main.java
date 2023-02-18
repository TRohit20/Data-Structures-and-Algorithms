package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 32;
        int b = 0;

        try {
//            divide(a,b);
//            You can also mimic exceptions like this
            throw new Exception("Just for fun ");
        }
//        You need to always place specific exceptions above the general one
//        The more strict ones should come above
        catch (ArithmeticException e){
            System.out.println("Specific Exception");
        }
        catch (Exception e ){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will execute no matter what happens");
        }
    }

    static int divide(int a, int b) throws Exception{
        if(b == 0){
            throw new Exception("Please do not use zero as B");
        }
        return a / b;
    }
}
