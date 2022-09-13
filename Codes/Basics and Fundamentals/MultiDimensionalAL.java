import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Multidimensional ArrayList, Syntax:
//        ArrayList<ArrayList<Data_type>> var_name = new ArrayList<>();

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

//        Initialise
        for(int i=0;i<3;i++){
            list.add(new ArrayList());
        }
        System.out.println("Enter elements to be stored in ArrayList:");
//        add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

    }
}
