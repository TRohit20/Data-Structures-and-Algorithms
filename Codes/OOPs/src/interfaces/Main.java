package interfaces;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();

//        You can have variables of interface type
        Engine car2 = new Car();

        CustomCar car = new CustomCar();

        car.startCar();
        car.startMusic();
//        Without creating a new object you were able to change a part.
//        You didnt have to change the whole car to change a part
        car.upgradeEngine();
        car.startCar();
    }
}
