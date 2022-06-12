public class MethodOverr {
    void add(int x, int y){
        System.out.println("Result:"+(x+y));
    }
    void add(int x, int y, int z){
        System.out.println("Result:"+(x+y+z));

        }
        public static void main(String[] args){
        MethodOverr m = new MethodOverr();
        m.add(2,4);
        m.add(4,5,6);

    }
}
