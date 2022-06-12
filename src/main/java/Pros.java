public class Pros {
    public static void main(String[] args){
        String s= "python";
        String s1= " ";
        int temp = s.length()-3;
        for(int i=temp; i<s.length(); i++){
            s=s+s.charAt(i);



        }
        System.out.println(s+s1+s);
    }
}
