import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter names to be stored in a array:");
        System.out.println("Enter the values of array:");
//        syntax for arrays
//        data_type[] var_name = new data_type[]

        String[] names= new String[5];
        for(int i=0;i<names.length;i++){
            names[i]=in.nextLine();
        }
//        One way of output is using for-loop like below:
//        for(int i=0;i<names.length;i++) {
//            System.out.print(names[i]);
//        }
//        2nd way of giving output for a Array:
//        Syntax:
//        sout(Arrays.toString());
        System.out.println(java.util.Arrays.toString(names));

//        Input to be taken for Array using For-Loop
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        for (int i = 0;i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
