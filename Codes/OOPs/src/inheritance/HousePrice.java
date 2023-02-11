package inheritance;

public class HousePrice extends CustomHouse {
    double price;

    HousePrice(){
        super();
        this.price = 10000000;
    }

    HousePrice(HousePrice h1){
        super(h1);
        this.price = h1.price;
    }

    HousePrice(double length, double width, double squareFeet, double rooms, double price){
        super(length, width, squareFeet, rooms);
        this.price = price;
    }
}
