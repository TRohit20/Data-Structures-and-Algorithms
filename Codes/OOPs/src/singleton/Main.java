package singleton;

public class Main {
    public static void main(String[] args) {
        SingletonClass object = SingletonClass.getInstance();

        SingletonClass object2 = SingletonClass.getInstance();

        SingletonClass object3 = SingletonClass.getInstance();

        // All of the above reference variables are given the same object.
    }
}
