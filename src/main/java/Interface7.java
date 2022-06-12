public interface Interface7 {
    int x= 10;
    int y =30;
    public abstract void m1();
    //public abstract void m2();

}
class Interface implements Interface7{
    public void m1(){
        System.out.println(x);

        }
        public static void main(String[] args){
        Interface i = new Interface();
        i.m1();
    }
}
