public class Polis {
 public static void main(String[] args) {
     String s="MOM";
     String reverse="";
     for(int i = s.length()-1;i>=0; i--){
         reverse= reverse+s.charAt(i);
     }
     if(s.equals(reverse)){
         System.out.println("Given string is polindrome");
     }
     else{
         System.out.println("Given string is not polindrome");
     }
 }
 }


