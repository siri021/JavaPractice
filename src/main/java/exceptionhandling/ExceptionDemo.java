package exceptionhandling;

public class ExceptionDemo {
public static void main(String[] args){
    try{
        int arr[]={2,5};
        arr[2]=5;
        arr[3]=3/0;
    }
    catch(ArithmeticException ae){
        ae.printStackTrace();
    }
    catch(ArrayIndexOutOfBoundsException aioo){
        aioo.printStackTrace();
    }
}
}
