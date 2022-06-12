package exceptionhandling;

public class ExceptionDemo1 {
static void validate(int age){
    if(age<18){
        throw new ArithmeticException("you are not elgible for vote");
    }
    else{
        System.out.println("you are elgible");
    }
}
public static void main(String[] args){
    validate(17);
    System.out.println("program suceesfuuly competed");
}
}
