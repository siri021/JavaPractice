package oops;

public class Methodoverloading {
    void add(int x, int y){
        System.out.println("Result :"+(x+y));
    }
    void add(int x, int y , int z){
        System.out.println("Result :"+(x+y+z));
    }
    public static void main(String[] args){
        Methodoverloading m = new Methodoverloading();
        m.add(2,1);
        m.add(1,3,4);
    }
}
