package accessControls;

public class ObjectDemo {
    int num;

    ObjectDemo(int num){
        this.num = num;
    }

//    Basically gives the number representation of an object
//    A unique representation of a object via number
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

//    Already covered
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
