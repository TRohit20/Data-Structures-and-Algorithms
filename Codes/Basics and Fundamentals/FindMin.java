import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={345,42,42,42,32,5665,23,43};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
     if(arr.length==0){
          return -1;
     }
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(ans>arr[i]){
                ans=arr[i];
            }
        }
        return ans;
    }
}