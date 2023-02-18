package cloning;

public class Main {
    public static void main(String[] args) throws Exception{
        Humans rohit = new Humans(12,"Rohit");
        Humans twin = (Humans) rohit.clone();
    }
}
