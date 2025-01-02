package generics.comparingObjects;

public class Student implements Comparable<Student>{
    int rollNumber;
    float marks;

    Student(int rollno, float marks){
        this.marks = marks;
        this.rollNumber = rollno;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("in compare to method");
        int diff = (int)(this.marks - o.marks);

        // if diff == 0: means both are equal
        // if diff < 0: means o is bigger else o is smaller

        return diff;
    }

    @Override
    public String toString(){
        return marks + " ";
    }
}
