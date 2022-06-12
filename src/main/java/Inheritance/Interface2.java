package Inheritance;

public interface Interface2 {
    int y = 20;
    public abstract void m1();
}
class Interface3 implements Interface1,Interface2{
    public void m1(){
        System.out.println("welcome");

    }
    public void m2(){
        System.out.println("siri");

        }
        public static void main(String[] args){
        Interface3 i = new Interface3();
        i.m1();
        i.m2();

    }
}
