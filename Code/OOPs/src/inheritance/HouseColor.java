package inheritance;

public class HouseColor extends CustomHouse{
    String colors;

    HouseColor(){
        this.colors = "Blue";
    }

    HouseColor(HouseColor h1){
        super(h1);
        this.colors = h1.colors;
    }

    HouseColor(double length, double width, double squareFeet,double rooms, String colors){
        super(length,width,squareFeet,rooms);
        this.colors = colors;
    }
}
