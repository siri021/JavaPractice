package oops;

public class Encapsulation {
 private String ename;
 private int eid;
 public String getEname(){
     return ename;
 }
 public void setEname(String ename){
     this.ename= ename;

 }
 public int getEid(){
     return eid;
 }
 public void setEid(int eid){
     this.eid=eid;
 }
 public static void main(String[] args){
     Encapsulation e= new Encapsulation();
     e.setEname("siri");
     e.setEid(12);
     System.out.println(e.getEname());
     System.out.println(e.getEid());
 }
}
