package packageExample;

//This is a demonstration of how to initialise a static variable
public class Static {
    static int a = 5;
    static int b;

//    Using a static block which executes exactly once when class is loaded
    static {
        System.out.println("Hi, this is a static block");
        b = a * 10;
    }

    public static void main(String[] args) {
        Static obj1 = new Static();
        System.out.println(Static.a + " " + Static.b);

        Static.b /= 10;

        Static obj2 = new Static();
        System.out.println(Static.a + " " + Static.b);
    }
}
