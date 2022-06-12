public class Car extends Bike{
    void msg(){
        System.out.println("msg sucessfully is sending to you");
    }
    public static void main(String[] args){
        Car c= new Car();
        c.msg();
        c.run();
    }
}
