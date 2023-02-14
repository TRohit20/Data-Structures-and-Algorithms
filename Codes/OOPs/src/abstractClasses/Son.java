package abstractClasses;

public class Son extends Parent{

    Son(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("Hi, THe son would like to be a Software Engineer");
    }

    @Override
    void partner(){
        System.out.println("The son loves himself Lol");
    }

    @Override
    void random(){
        super.random(); // Super to call a method from above/Parent class
    }
}
