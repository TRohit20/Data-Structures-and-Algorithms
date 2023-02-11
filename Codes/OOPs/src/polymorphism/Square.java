package polymorphism;

public class Square extends Shapes{

//    This will run when object of Square is created
//    Hence it'll override the parent method
    @Override //Annotation used to check if a method is overridden
    void area(){
        System.out.println("The area of square is side * side");
    }
}
