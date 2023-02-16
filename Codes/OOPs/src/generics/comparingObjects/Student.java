package generics.comparingObjects;

public class Student implements Comparable<Student>{
    float marks;
    int rollNumber;

    Student(float marks, int rollno){
        this.marks = marks;
        this.rollNumber = rollno;
    }

    @Override
    public int compareTo(Student o) {
//        If the value is equal to 0, then both are equal.
//        if Diff is < 1 means name is bigger else its smaller
        int diff = (int)(this.marks - o.marks);
        return diff;
    }

    public String toString(){
        return marks + " ";
    }
}
