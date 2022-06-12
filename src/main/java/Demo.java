public class Demo extends Example  {
    void msg(){
        System.out.println("child class");
    }
   public static void main(String[] args){
        Demo d= new Demo();
        d.msg();
   }
}
