import accessControls.Practise;

public class Main {
    public static void main(String[] args) {
        Employee rohit; //You are only declaring the object not creating it

        rohit = new Employee(14, "Rohit", 99.2f);
        rohit.greeting();
        rohit.changeName("Sneakerhead");

        Employee karthik = new Employee();
        System.out.println(karthik.employeeName);

        Employee random = new Employee(karthik);
        System.out.println(karthik.performance);

        final FinalExample example = new FinalExample("Rohit");
        example.name = "Rohit T"; //You can modify the value of the instance variable(Object)
//        But you cannot do this Cz when non-primitive is final, you cannot reassign it
//        example = new FinalExample("sdfnvjadk");

    }

//    Creating a class
    static class Employee{
        int employeeID;
        String employeeName;
        float performance;

//      Student xyz = new Student(17, "xyx", 89.7f) ;
//      Here, this will be replaced with xyx
        Employee(int id, String name, float perf){
            this.employeeID = id;
            this.employeeName = name;
            this.performance = perf;
        }

        Employee(){
           this (1957,"Rohit",100.0f);
        }

//        Creating a constructor that takes value from another object
        Employee(Employee instance){
            this.employeeID = instance.employeeID;
            this.employeeName = instance.employeeName;
            this.performance = instance.performance;
        }

        void greeting(){
            System.out.println("hello there! My name is "+ employeeName);
        }

        void changeName(String newName){
            employeeName = newName;
            System.out.println("Hello there, this is " + employeeName);
        }
    }

//    A class to demonstrate about final keyword
    static class FinalExample {
        final int a = 10;  // Final variable should always be initialised
        String name;

        FinalExample(String name){
            this.name = name;
            System.out.println(a);
        }
    }
}