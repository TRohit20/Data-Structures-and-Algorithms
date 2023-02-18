package cloning;

public class Humans implements Cloneable {
    int age;
    String name;
    int[] arr;

    Humans(int age, String name){
        this.age = age;
        this.name = name;
    }

    Humans(Humans other){
        this.name = other.name;
        this.age = other.age;
    }

//    public Object clone() throws CloneNotSupportedException {
////        This is Shallow Copy
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException{
        Humans twin = (Humans) super.clone(); //Shallow copy

//        Making a deep copy now
        twin.arr = new int[twin.arr.length];
        for(int i = 0; i < twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
