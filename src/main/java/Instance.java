public class Instance {
    int x= 10;// instance method vs instance method
    //instance method can access instance variables  and methods  they belong to same class otherwise they must be acess by using referece
    void m1(){
        System.out.println("m1 method");
    }
    void m2(){
        System.out.println(x);
        m1();

    }
    public static void main(String[] args){
        Instance i =new Instance();
        i.m2();
    }


}
