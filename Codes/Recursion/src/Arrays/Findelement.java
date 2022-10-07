package Arrays;

public class Findelement {
    public static void main(String[] args) {
        int[] arr={2,9,3,5,2};
        System.out.println(find(arr,9,0));
    }
    public static int find(int[] arr,int target,int index){
//        Base condition
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return find(arr,target,index+1);
        }
    }
}
