public interface Interface6 {
    int x= 15;
   public abstract void add();

    }
class Myinterface implements Interface6{
    public void add(){
        System.out.println(x);
    }
    public static void main(String[] args){
        Myinterface m = new Myinterface();
        m.add();
    }
}

