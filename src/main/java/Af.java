import java.util.Scanner;

public class Af {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse:");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
            System.out.println("Reverse of a String is:");
            System.out.println(rev);
        }
    }























