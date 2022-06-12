public class Poli {
 public static void main(String[] args){
     int r,m,sum=0;
     int n =151;
     m=n;
     while(n>0){
         r= n%10;
         sum=(sum*10)+r;
         n=n/10;
     }
     if(sum==m){
         System.out.println("Given number is polindrome number");
     }
     else{
         System.out.println("Given number is not polindrome number");
     }
 }
}
