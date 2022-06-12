public class A {
int m1(){
    int x= 10;
    int y = 20;
    int c= x+y;
   // System.out.println(c);
    return c;


}
public static void main(String[]  args){
    A a = new A();
    int result = a.m1();
    System.out.println(result);
}

}
