public class Add {
    void add(int x, int y){
        System.out.println("Result:"+(x+y));
    }
    void add(int z){
        System.out.println("Result:"+z);

    }
    public static void main(String[] args){
        Add a= new Add();
        a.add(2,4);
        a.add(5);
    }
}
