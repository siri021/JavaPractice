package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {
 public static void main(String[] args){
     TreeSet<String>ts= new TreeSet<>();
     ts.add("Apple");
     ts.add("Banana");
     ts.add("Mango");
     ts.add("Red apple");
     Iterator i=ts.descendingIterator();
     while(i.hasNext()){
         System.out.println(i.next());

     }
 }
}
