package generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0; // Also, works as index number

    CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

//    Custom Methods for arraylist
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public int remove(int index){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

//    To check if the default array is full
    private boolean isFull(){
        return size == data.length;
    }

//    Function to resize i.e create a new array of double size
    private void resize(){
        int[] temp = new int[DEFAULT_SIZE * 2];
//        Copy the elements of original to new array
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString(){
        return "CustomArrayList: " + "Elements in it are = " + Arrays.toString(data) + "Size:" + size;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        for(int i = 0; i < 15; i++){
            list.add(12);
        }
        System.out.println(list);
    }
}
