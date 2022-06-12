public class Additionss {
    void add(int x, int y){
        System.out.println("Result:"+(x+y));


        }
        void add(int x, int y,int z ){
        System.out.println("Result:"+(x+y+z));

    }
    public static void main(String[] args){
        Additionss ad = new Additionss();
        ad.add(2,5);
        ad.add(3,5,7);
    }
}
