package generics.comparingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student rohit = new Student(99.7f,57);
        Student santosh = new Student(99.5f,01);
        Student giridhar = new Student(99.3f,02);
        Student lakshana = new Student(99.2f,03);
        Student keerthi = new Student(99.1f,04);

        Student[] students = {santosh, rohit, keerthi, lakshana, giridhar};
        System.out.println(Arrays.toString(students));
//        You can also do this
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


//        if(rohit.compareTo(santosh) < 0 ){
//            System.out.println("Santosh has more marks than rohit");
//        }
    }
}
