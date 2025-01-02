package Fundamentals;

public class countSteps {
    public static void main(String[] args) {
        System.out.println(steps(41));
    }
//    Function to get the number of steps
    public static int steps(int n){
        return helper(n,0);
    }
//    Function to get the number of steps using helper function
    public static int helper(int n,int steps){
//        Base Condition
        if(n/10 == n){
            return steps;
        }
//        If a number is even
        if(n%2 == 0){
//            Recurrence Relation
            return helper(n/2,steps+1);
        }
//        If a number is odd, -1 and make it even and then
//        The recurrence relation for it
        return helper(n-1,steps+1);
    }
}
