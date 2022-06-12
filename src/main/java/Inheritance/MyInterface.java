package Inheritance;

public interface MyInterface{
  public static final  int x = 10;
    public abstract void m1(); // abstract methods


    }
class MyInterfacedemo implements MyInterface{
    @Override
    public void m1() {
        System.out.println("welcome");

    }
    public static void main(String[] args){
        MyInterfacedemo d= new MyInterfacedemo();
        d.m1();

    }
}

