package inheritance;

public class Main {
    public static void main(String[] args) {
        House h1 = new House();
        CustomHouse h2 = new CustomHouse(12,15,3000,4);

        System.out.println(h1.length + " " + h1.squareFeet);
        System.out.println((h2.length + " "+ h2.squareFeet + " " + h2.rooms));
    }
}
