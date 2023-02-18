package exceptionHandling;

public class Fun {
    public static void main(String[] args) throws CustomException{
        String name = "Rohit";

        if(name.equals("Rohit")){
            throw new CustomException("My name is Rohit ");
        }
    }
}
