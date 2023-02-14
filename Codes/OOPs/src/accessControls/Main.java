package accessControls;

public class Main {
    public static void main(String[] args) {
        Practise obj = new Practise(10,"Rohit");

        obj.getName();

        ObjectDemo obj1 = new ObjectDemo(12);
        ObjectDemo obj2 = new ObjectDemo(13);

        if(obj1 == obj2){
            System.out.println("Equal");
        }

        if(obj1.equals(obj2)){
            System.out.println("True ");
        } else{
            System.out.println("False");
        }

//        Instanceof Method
        System.out.println(obj instanceof Practise);
//        Getclass Method
        System.out.println(obj.getClass().getName());
    }
}
