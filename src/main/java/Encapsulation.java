public class Encapsulation {
 private String  ename;
 private  int eno;
 public String getEname(){
     return ename;

 }
 public void setEname(String ename){
 this.ename=ename;

 }
 public int GetEno(){
     return eno;
 }
 public void setEno(int eno){
     this.eno=eno;
 }
 public static void main(String[] args){
     Encapsulation e= new Encapsulation();
     e.setEname("siri");
     e.setEno(10);
     System.out.println(e.getEname());
     System.out.println(e.GetEno());
 }

}
