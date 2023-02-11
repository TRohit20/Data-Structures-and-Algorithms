package inheritance;

public class House {
    double length;
    private double width;
    double squareFeet;
//    double rooms;

    House(){

//        Every class we create in java are derived from the super class "Object"
        super();

        this.length = 10;
        this.width = 20;
        this.squareFeet = 2000;
    }

    House(double length, double width, double squareFeet){
        this.length = length;
        this.width = width;
        this.squareFeet = squareFeet;
    }

    House(House h1){
        this.length = h1.length;
        this.width = h1.width;
        this.squareFeet = h1.squareFeet;
    }

    void information(){
        System.out.println("this is a function inside the class HOUSE");
    }

}
