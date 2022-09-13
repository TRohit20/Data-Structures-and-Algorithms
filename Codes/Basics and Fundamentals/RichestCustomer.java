// https://leetcode.com/problems/richest-customer-wealth/

import java.util.Scanner;

public class RichestCustomer {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.println("Enter elements of arrays:");
//        initialise 2d array
      int[][] accounts=new int[2][3];
//      take inout for 2D array
      for(int i=0;i<accounts.length;i++){
          for(int j=0;j<accounts[i].length;j++){
              accounts[i][j]=in.nextInt();
          }
      }
      int answer=richestcustomer(accounts);
        System.out.println(answer);
    }
//    Function to find the richest customer
    public static int richestcustomer(int[][] accounts){
//        initial answer=0
        int ans=0;
//        In this array, each element is a array in itself,so row is person
//        column is accounts of the person
        for(int person=0;person<accounts.length;person++){
//            Sum of wealth in accounts of each person
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
//            if the sum of wealth of perosn greater than ans then :

            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
