package generics;

import java.util.Arrays;

// Below is the documentation to learn more about Generics
// https://docs.oracle.com/javase/tutorial/java/generics/erasure.html
public class CustomGenArrayList<T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0; // Also, works as index number

    CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    //    Custom Methods for arraylist
    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }

//    Casting to type T
    public T remove(int index){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
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
        Object[] temp = new Object[DEFAULT_SIZE * 2];
//        Copy the elements of original to new array
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString(){
        return "CustomGenArrayList: " + "Elements in it are = " + Arrays.toString(data) + "Size:" + size;
    }

    public static void main(String[] args) {
        CustomGenArrayList<String> list= new CustomGenArrayList();

        for (int i = 0;i < 15; i++){
            list.add("Rohit");
        }

        System.out.println(list);
    }
}
