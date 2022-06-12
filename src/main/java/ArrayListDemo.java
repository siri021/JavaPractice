import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args){
    ArrayList<Integer> lst = new ArrayList<Integer>();
    ArrayList<Integer>removeduplcates = new ArrayList<>();
    lst.add(1);
    lst.add(2);
    lst.add(2);
    lst.add(3);
    for(int i = 0; i<lst.size(); i++){
        if(!removeduplcates.contains(lst.get(i))) {
            removeduplcates.add(lst.get(i));
            System.out.println(lst.get(i));
        }
    }
}


    }

