package inheritance;

public class CustomHouse extends House{
    double rooms;
    double floors;

    CustomHouse(){
        this.rooms = 3;
        this.floors = 4;
    }

    CustomHouse(double length, double width,double squareFeet, double rooms){
        super(length,width,squareFeet); // We are calling a parent class constructor to initialise parent class members
        this.rooms = rooms;
    }
}
