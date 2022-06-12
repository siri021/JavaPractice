public class Addion {
    void add(int x, int y){
        System.out.println("Result:"+(x+y));
    }
    void add(int x, int y, int z){
        System.out.println("Result:"+(x+y+z));
    }
    public static void main(String[] args){
        Addion ad= new Addion();
        ad.add(2,4);
        ad.add(1,2,3);
    }
}
