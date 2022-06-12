public class Polindromeswqr {
public static void main(String[] args){
   String s= "MADAM";
   String reverse="";
   for(int i = s.length()-1; i>=0; i--){
       reverse= reverse+s.charAt(i);
   }
   if(s.equals(reverse)){
       System.out.println("Given string: "+s+" palindrome:"+reverse);
   }
   else{
       System.out.println("Given string: "+s+" palindrome:"+reverse);
   }

}
}
