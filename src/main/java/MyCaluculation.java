public class MyCaluculation extends Calucation{
    int z;
    void substaction(int x, int y){
        z= x-y;
        System.out.println("The two numbers is substraction:"+z);

    }
    public static void main(String[] args){
        MyCaluculation m = new MyCaluculation();
        m.addition(2,4);
        m.substaction(6,3);
    }
}
