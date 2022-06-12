import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> removeduplicates = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(1);
        al.add(2);
        al.add(5);
        for (int i = 0; i < al.size(); i++) {
           if(!removeduplicates.contains(al.get(i))){
               removeduplicates.add(al.get(i));
               System.out.println(al.get(i));

            }
        }
    }
}

