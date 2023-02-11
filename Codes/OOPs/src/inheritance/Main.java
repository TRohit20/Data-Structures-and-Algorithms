package inheritance;

public class Main {
    public static void main(String[] args) {
        House h1 = new House();
        CustomHouse h2 = new CustomHouse(12,15,3000,4);

        System.out.println(h1.length + " " + h1.squareFeet);
        System.out.println((h2.length + " "+ h2.squareFeet + " " + h2.rooms));

        House h3 = new CustomHouse(10,143,12423,3);
        System.out.println(h3.squareFeet);
//        Here, It's the type of ref_var actually determines which mems can be accessed and not the type of object
//        Since, 'rooms' is mem of child/subclass, it cannot access it
//        System.out.println(h3.rooms);

//        CustomHouse h4 = new House(12,14,1452);
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. CustomHouse
        // Hence, you should have access to rooms variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of a child class?
//        The parent class does not know that 'rooms' exists, hence the error
    }
}
