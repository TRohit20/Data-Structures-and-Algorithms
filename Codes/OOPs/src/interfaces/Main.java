package interfaces;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();

//        You can have variables of interface type
        Engine car2 = new Car();

        audi.start();
    }
}
