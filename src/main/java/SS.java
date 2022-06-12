public class SS {
    static int x = 20;
    static void m1(){
        System.out.println("m1 method");

    }
   static void m2(){
        m1();
        System.out.println(x);

    }
    public static void main(String[] args){
        //SS s = new SS();
       // System.out.println(s.x);
        SS.m2();
    }
}
