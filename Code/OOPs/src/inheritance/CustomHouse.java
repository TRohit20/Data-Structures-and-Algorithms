package inheritance;

public class CustomHouse extends House{
    double rooms;
    double floors;

    CustomHouse(){
        this.rooms = 3;
        this.floors = 4;
    }

    CustomHouse(double length, double width,double squareFeet, double rooms){
//        Calling the parent class constructor
        super(length,width,squareFeet); // We are calling a parent class constructor to initialise parent class members
        this.rooms = rooms;

//        2nd Use case of Super keyword
//        System.out.println(super.rooms);
    }

//    Same as prev discussed, it's like House h2 = new CustomHouse(h1);
    CustomHouse(CustomHouse h1){
        super(h1);
        rooms = h1.rooms;
        floors = h1.floors;
    }
}
