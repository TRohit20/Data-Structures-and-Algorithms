package abstractClasses;

public class Daughter extends Parent {

    Daughter(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("Hi, the daughter would like to be Doctor");
    }

    @Override
    void partner(){
        System.out.println("The daughter loves peppa pig lol");
    }
}
