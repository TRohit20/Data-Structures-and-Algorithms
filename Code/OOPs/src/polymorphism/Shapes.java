package polymorphism;

public class Shapes {
    void area(){
        System.out.println("This is the area of the shapes");
    }

    static void greeting(){
        System.out.println("hi, this is from Shapes class");
    }

//    Early Binding: Final prevents polymorphism and overriding here
//    final void area(){
//        System.out.println("hi");
//    }
}
