public class Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name="Rohit";
        System.out.println("Enter a name");
        String name2= in.nextLine();
        System.out.println(name == name2);
    }
}
