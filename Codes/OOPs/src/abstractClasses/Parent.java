package abstractClasses;

public abstract class Parent {

    int age;
//  You can have a abstract class constructor which can be called by super in subclasses but cannot be used to create objects
    Parent(int age){
        this.age = age;
    }
    abstract void career();
    abstract void partner();

    static void greeting(){
        System.out.println("Hello there");
    }

    void random(){
        System.out.println("Hi this is just random");
    }
}
