package singleton;

import accessControls.Practise;

public class SubClass extends Practise {

    public SubClass(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10, "Rohit");
        int n = obj.num;
    }
}
