import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Note:  Array Objects are not continuous. It depends on the JVM.
//        Syntax for 2D Arrays:
//        data_type[][] var_name = new data_type[r][c];
//        It is mandatory to initialise rows but not mandatory for columns.
//        Cz In 2D Arrays, Each element is an array of array.

        int[][] arr=new int[3][3];
        System.out.println("enter the elements to be entered in array");

//        one way of input for 2D arrays:
//        data_type[][] var_name = {
//                                  {1,2,3},
//                                   {4,5},
//                                   {6,7}};

//        Another way of input is:
//        for()= For taking input for a row
//        nested for-loop to take input for columns of a row
        for(int r=0;r<arr.length;r++){
//            repeat for each row for input/output
            for(int c=0;c<arr[r].length;c++){
                arr[r][c]=in.nextInt();
            }
        }
//   One way to output 2D Arrays:
//        for(int r=0;r<arr.length;r++){
//            for(int c=0;c<arr[r].length;c++){
//                System.out.print(arr[r][c]+" ");
//            }
//            System.out.println();
//        }

//     Another way and Easiest way to print arrays:
       for(int r=0;r<arr.length;r++){
           System.out.println(Arrays.toString(arr[r]));
       }
//       Quick example with string:
        String[][] names = new String[3][3];

       for(int r=0;r<names.length;r++){
           for(int c=0;c<names[r].length;c++){
               names[r][c]=in.nextLine();
           }
       }
       for(int r=0;r<names.length;r++){
           System.out.println(Arrays.toString(names[r]));
       }

//       Dynamic Arrays
        int[][] arr2D={
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
       for(int r=0;r<arr2D.length;r++){
           for(int c=0;c<arr2D[r].length;c++){
               System.out.print(arr2D[r][c]+" ");
           }
           System.out.println();
       }
    }
}
