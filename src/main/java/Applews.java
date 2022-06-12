public class Applews {
    public static void main(String[] args) {
        String s = "MADAM";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);

        }
            if (s.equals(reverse)) {
                System.out.println("Given string is :"+s+"  palindrome:" + reverse);
            } else {
                System.out.println("Given string is not:"+s+" palindrome:" + reverse);
            }

        }
    }




