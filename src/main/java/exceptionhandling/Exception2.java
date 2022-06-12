package exceptionhandling;

public class Exception2 {
     static void valddate(int age) {
          if(age<18){
          throw new ArithmeticException("you are not elgible for vote");


     }
          else{
               System.out.println("you are elgible for vote");
          }

     }
     public static void main(String[] args){
          valddate(17);
     }












     }

















