public class Exm {
    static int x= 20;
    public static void main(String[] args){
        m1();
        Exm.x= 30;
        m1();

    }
    static void m1(){
        System.out.println("m1 ends");
        System.out.println(Exm.x);
        System.out.println("m1Ends");
    }

    }
