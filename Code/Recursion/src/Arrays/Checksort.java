package Arrays;

public class Checksort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(checksort(arr,0));
    }
//    Function to check if the given array is sorted or not
//    We just need to see if it is sorted so just boolean return type
    public static boolean checksort(int[] arr,int index){
//        Base Condition
        if( index == arr.length-1){
//            End of the array
            return true;
        }
//        Recurrence or recursive call
        return arr[index] < arr[index+1] && checksort(arr,index+1);
    }
}
