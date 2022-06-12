public class Program {
 public static void main(String[] args){
  String s= "python";
  String s1 = "";
  int temp = s.length()-3;
  for(int i = temp; i<s.length(); i++){
      s1= s1+s.charAt(i);

  }
  System.out.println(s1+s+s1);
 }
}
