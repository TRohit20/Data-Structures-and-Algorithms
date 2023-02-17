package generics.comparingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student rohit = new Student(57,99.7f);
        Student santosh = new Student(01,99.5f);
        Student giridhar = new Student(02,99.3f);
        Student lakshana = new Student(03,99.2f);
        Student keerthi = new Student(04,99.1f);

        Student[] students = {santosh, rohit, keerthi, lakshana, giridhar};
        System.out.println(Arrays.toString(students));
//        You can also do this
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


        if(rohit.compareTo(santosh) < 0 ){
            System.out.println("Santosh has more marks than rohit");
        }
    }
}
