package collections;

import java.util.LinkedList;

public class LinkedlistDemo {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("siri");
        l.add("Apple");
        l.add("Banana");
        l.add("donkey");
        l.add("fellow");
        l.addFirst("Dog");
        l.addLast("worng");
        //l.getFirst();
        l.removeFirst();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(l.get(0))) {
               // if (l.get(i).equals(l.get(3))) {
                    System.out.println(l.get(i));
                }
            }
        }
    }

