public interface Apple {
  int x= 10;
  abstract void m1();
}
class Demo1 implements Apple{
  public void m1(){
      System.out.println(x);
  }
  public static void main(String[] args){
      Demo1 d= new Demo1();
      d.m1();
  }

}

