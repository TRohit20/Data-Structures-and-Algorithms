public class printnums {
    public static void main(String[] args) {
        printnto1(5);
        print1ton(5);
    }
//    Function to return N to 1 numbers
    public static int printnto1(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return printnto1(n-1);
    }
//    Function to print 1 to N
    public static void print1ton(int n){
        if(n==0){
            return;
        }
        print1ton(n-1);
        System.out.println(n);
    }
}

