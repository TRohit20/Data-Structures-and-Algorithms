import java.util.Scanner;
//Arraylist is used typically when you don't know the size
//How ArrayList does it?
// half a certain capacity of the given arraylist is full. It creates a new Arraylist with double the size and the copies the data from the previous arraylist to new one and delete the previous ArrayList.

public class ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Syntax for Arraylist:
//        ArrayList<Data_type> var_name = new ArrayList<>(initial_capacity);
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>(10);
//        the object as many inbuilt functions such as add or update or remove and etc
        list.add(23);
        list.add(2);
        list.add(3);
        list.add(123);
        list.add(233);
        list.add(234);
        System.out.println("Enter elements of ArrayList:");
        //Another way of input for arraylist:
//        for(int i=0;i<5;i++){
//            list.add(in.nextInt());
//        }


        System.out.println(list.contains(23));
//        Updating a index in arraylist: list.set(index_no, )
        list.set(0,99);

        list.remove(4);
        System.out.println(list);
//        to get a particular item: list.get(index_no)
        System.out.println(list.get(2));

    }
}
