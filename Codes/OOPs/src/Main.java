public class Main {
    public static void main(String[] args) {
        Employee rohit; //You are only declaring the object not creating it

        rohit = new Employee();

        rohit.greeting();
        rohit.changeName("Sneakerhead");
    }

//    Creating a class
    static class Employee{
        int employeeID;
        String employeeName;
        float performance;

        Employee(){
            this.employeeID = 12;
            this.employeeName = "Rohit";
            this.performance= 99.2f;
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