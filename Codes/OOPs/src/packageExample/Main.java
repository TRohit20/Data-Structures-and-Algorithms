package packageExample;

public class Main {
    public static void main(String[] args) {
//        Humans rohit = new Humans(12,"Rohit",6,false);

        System.out.println(Humans.population);
    }

    public static class Humans{
        int age;
        String name;
        int height;
        boolean married;
        static int population;

        Humans(int age, String name,int height, boolean married){
            this.age = age;
            this.name = name;
            this.height = height;
            this.married = married;
            this.population += 1;
        }
    }
}
