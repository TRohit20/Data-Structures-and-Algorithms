//    https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/822378841/

public class DifofSumnProd {
        public int subtractProductAndSum(int n) {
            int temp;
            temp = n;
            int sum = 0;
            while( temp > 0){
                int remainder = temp %10;
                sum = sum + remainder;
                temp = temp/10;
            }
            temp = n;
            int product = 1;
            while( temp > 0){
                int remainder = temp%10;
                product *= remainder;
                temp /= 10;
            }
            int dif;
            dif = product - sum ;
            return dif;
        }
    }

