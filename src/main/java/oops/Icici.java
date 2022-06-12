package oops;

public class Icici extends Bank{
    float getRateOfintrest(){
        return 10;
    }
    public static void main(String[] args){
        Icici i = new Icici();
      System.out.println("Bank rate of intrest:"+i.getRateOfintrest())
      ;
    }
}
