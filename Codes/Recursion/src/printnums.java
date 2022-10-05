public class printnums {
    public static void main(String[] args) {
        printnto1(5);
    }
//    Function to return N to 1 numbers
    public static int printnto1(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return printnto1(n-1);
    }
}

