import java.util.Scanner;
//Q. Area Of Circle
//Q. Area Of Triangle
public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the radius:");
//        int radius = in.nextInt();
//        areaofcircle(radius);
        areaoftrianlge();
//        System.out.println(areaofcircle(radius));
        System.out.println(areaoftrianlge());
    }

    public static double areaoftrianlge() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of base and height");
        int base = in.nextInt();
        int height = in.nextInt();
        double area = (height * base)/2;
        return area;
    }

    public static double areaofcircle(int radius){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
