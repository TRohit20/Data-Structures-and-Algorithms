package interfaces.extendsDemo;

public interface A {
//    static interface methods should always have a body
//    call via the interface name
    public static void fun(){
        System.out.println("This is example of static method in interface");
    }

    void greeting();
}
