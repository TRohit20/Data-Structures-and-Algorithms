package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        Circle s2 = new Circle();
        Square s3 = new Square();

        s1.area();
        s3.area();

        Shapes s4 = new Circle();

        s1.greeting();
        s4.greeting(); // You can inherit Static method but cannot override
    }
}
