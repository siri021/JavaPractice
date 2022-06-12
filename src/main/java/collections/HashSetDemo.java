package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);
        // Iterator<Integer> i= h.iterator();
        // while(i.hasNext()){
        //    System.out.println(i.next());
        for (Integer i : h) {
            if (i == 2) {
                System.out.println(i);
            }
        }
    }
}


