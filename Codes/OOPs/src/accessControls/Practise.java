package accessControls;

public class Practise {
    protected int num;
    private String name;
    int[] arr;

    public Practise(){
        this.num = 1;
        this.name = "Rohit";
        this.arr = new int[num];
    }

    public Practise(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
