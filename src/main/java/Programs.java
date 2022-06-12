public class Programs {
public static void main(String[] args){
    String s= "Apple";
    String reverse="";
    for(int i = s.length()-1; i>=0; i--){
        reverse= reverse+s.charAt(i);

    }
    System.out.println("Reverse string:"+reverse);
}
}
