package exceptionhandling;

public class Exception {
 public static void main(String[] args){
     try{
     int a=10;
     int b = a/0;


     }
     catch(ArithmeticException ae){
       ae.printStackTrace();


     }
     finally{
         System.out.println("This is the finally block");
     }
 }
}
