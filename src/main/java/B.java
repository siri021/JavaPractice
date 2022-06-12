public class B {
  int add(int x, int y){
      int z= x+y;
      //System.out.println(z);
      return z;
  }
  public static void main(String[] args){
      B b = new B();
      int result = b.add(2,2);
      System.out.println(result);

  }



}