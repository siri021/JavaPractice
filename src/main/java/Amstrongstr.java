public class Amstrongstr {
 public static void main(String[] args){
     int r,m,sum=0;
     int n = 153;
     m=n;
     while(n>0){
        r = n%10;
        sum = sum+r*r*r;
        n = n/10;

 }
     if(sum==m){
         System.out.println("given number is amstrong number");
     }
     else{
         System.out.println("given number is not amstrong number");
     }



    }



}
