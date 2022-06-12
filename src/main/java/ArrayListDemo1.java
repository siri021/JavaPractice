import java.sql.Array;
import java.util.ArrayList;

public class ArrayListDemo1 {
  public static void main(String[] args){
      ArrayList al = new ArrayList();
      al.add(1);
      al.add(2);
      al.add("siri");
      al.add("siri");
      for(int i = 0; i<al.size(); i++){
          if(al.get(i).equals(2)){
              System.out.println(al.get(i));
          }
      }

      }


  }
