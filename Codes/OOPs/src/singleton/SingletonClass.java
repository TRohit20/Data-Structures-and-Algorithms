package singleton;

// When you want to have only one instance or object or a class at max
public class SingletonClass {
//    Private functions can only be used inside the present class
//    Since it is private, it cannot be accessed outside
    private SingletonClass(){

    }

//    So we create a private instance
//    You'll only return this, not create a object so you can put it static
    private static SingletonClass instance;

//    Now we create a public function that returns a instance
    public static SingletonClass getInstance(){
//        Check whether only 1 object is created or not
        if(instance == null){
            instance = new SingletonClass();
        }
//        If already created
        return instance;
    }
}
