package interfaces.nestedInterface;

public class A {
//    Nested interface or Member Interface
    public interface nI{
        boolean isEven(int num);
    }
}

class B implements A.nI {

    @Override
    public boolean isEven(int num) {
        return (num & 1) == 0;
    }
}
