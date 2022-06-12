public class Swap {
    public static void main(String[] args){
        int x=3;
        int y = 4;
        System.out.println("before string:"+x+":"+y);
        x= x+y;
        y= x-y;
        x=x-y;
        System.out.println("After string:"+x+":"+y);
    }

}
