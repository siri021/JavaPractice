public class Addition {
 void m1(int x, int y){
     System.out.println("Result:"+(x+y));

 }
void m1(int z){
     System.out.println("Result:"+(z));
}
public static void main(String[] args){
     Addition ad = new Addition();
     ad.m1(2,3);
     ad.m1(2);
}
}
