public class D {
 static int x= 10;
 public static void main(String[] args) {
     m1();
     D.x = 20;
     m1();
 }
     static void m1(){
         System.out.println("m1 stars");
         System.out.println(D.x);
         System.out.println("m1 ends");


     }
 }

