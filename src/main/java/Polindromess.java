public class Polindromess {
public static void main(String[] args){
    int r, m, sum =0;
    int n = 151;
    m=n;
    while(n>0){
        r = n%10;
        sum = sum*10+r;
        n = n/10;
    }
    if(sum ==m){
        System.out.println("given number is polindrome");

    }
    else
    {
        System.out.println("given number is not polndrome");
    }
}
}
