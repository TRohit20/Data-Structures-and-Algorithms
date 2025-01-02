public class Patterns {
    public static void main(String[] args) {
        pattern2(4,0);
        pattern1(4,0);
    }
//    Function to print a pattern
    public static void pattern1(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("*");
            pattern1(row,col+1);
        } else{
            System.out.println();
            pattern1(row-1,0);
        }
    }
//    Function to print the same triangle in a flipped manner
    public static void pattern2(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            pattern2(row,col+1);
            System.out.print("*");
        } else{
            pattern2(row-1,0);
            System.out.println();
        }
    }
}
