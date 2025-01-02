package Arrays;

import java.util.ArrayList;

public class Findelement {
    public static void main(String[] args) {
        int[] arr = {2, 9, 3, 5, 5, 2, 9, 9};
//        find1(arr,9,0);
//        System.out.println(list);
//        System.out.println(findall(arr,0,5,new ArrayList<>()));
        System.out.println(findElement(arr,9,0));
    }
//    Function to find an element in a sorted array with no duplicates
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
//    Function to find the element in an array with duplicates
    static ArrayList<Integer> list= new ArrayList();
    public static void find1(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        find1(arr,target,index+1);
    }
//    Function to return the arrayList
    public static ArrayList<Integer> findall(int[] arr,int index,int target,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findall(arr,index+1,target,list);
    }
//    Function to return the list but by passing it in the body
    public static ArrayList<Integer> findElement(int[] arr, int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findElement(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
