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
            this.employeeID = 12;
            this.performance = 99.5f;
            this.employeeName = "Geek lover";
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
}