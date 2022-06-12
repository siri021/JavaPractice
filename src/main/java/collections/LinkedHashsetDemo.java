package collections;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        ls.add("Banana");
        ls.add("Mango");
        ls.add("Apple");
        ls.add("berry");
        ls.add("gova");
        ls.remove("Mango");
        //ls.clear();
        //ls.size();
        for(String s:ls){
            System.out.println(s);

            }
        }

    }

