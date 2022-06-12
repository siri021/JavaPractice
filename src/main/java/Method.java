public class Method {
    int addNumber(int x, int y) {
     int z= x+y;
     return z;


    }
    public static void main(String[] args){
        Method m = new Method();
        int result = m.addNumber(5,6);
        System.out.println(result);

        


    }
}
