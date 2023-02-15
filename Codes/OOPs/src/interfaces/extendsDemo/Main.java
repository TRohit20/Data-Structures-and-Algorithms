package interfaces.extendsDemo;

public class Main implements B{
//    You have to implement all properties (Interface inheritance)
    @Override
    public void greeting() {

    }

    @Override
    public void programming() {

    }

    public static void main(String[] args) {
//        Calling a static method from interface
        A.fun();
    }
}
