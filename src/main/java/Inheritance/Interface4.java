package Inheritance;

public interface Interface4 {
    int x= 15;
    public abstract void m1();
}
interface Interface5 extends Interface4{
   int y = 20;
       public abstract void m2();


    }

 class Example implements Interface5{
     @Override
     public void m1() {
         System.out.println("welcome");

     }

     @Override
     public void m2() {
         System.out.println("hellow");
     }
     public static void main(String[] args){
         Example e = new Example();
         e.m1();
         e.m2();
     }
 }



