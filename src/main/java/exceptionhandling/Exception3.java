package exceptionhandling;

public class Exception3 {
    public static void main(String[] args) {
        try {
            int[] a = {2, 4};
            a[1] = 1;
            a[2] = 2;
            a[3] = 3;
            a[4] = 4;
            a[5] = 5;
            int a1=15;
            int b= a1/0;

        } catch (ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
        }
        catch(ArithmeticException ae1){
            ae1.printStackTrace();
        }
        finally{
            System.out.println("sucessfully is completed");
        }
    }
}
