package abstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(22);
        son.partner();
        son.random();

        Daughter daughter = new Daughter(22);
        daughter.partner();

//        Parent mom = new Parent();
        Parent.greeting();

//        You can do this
        Parent example = new Daughter(2);
        example.partner();
    }
}
