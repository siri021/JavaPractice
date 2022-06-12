public class R extends Msg {
 void run(){
     System.out.println("child class");
 }
 public static void main(String[] args){
     R r = new R();
     r.run();
 }
}
