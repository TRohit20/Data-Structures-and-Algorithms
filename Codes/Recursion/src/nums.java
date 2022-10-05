public class nums {
    public static void main(String[] args) {
        print(5);
    }
//    Funciton to return N to 1 numbers
    public static int print(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return print(n-1);
    }
}

