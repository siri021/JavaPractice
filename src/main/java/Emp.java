public class Emp {
 private int eid;
 private String ename;
 public int getEid(){
     return eid;
 }
 public void setEid(int eid){
     this.eid=eid;

 }
 public String getEname(){
     return ename;
 }
 public void setEname(String ename){
     this.ename=ename;
 }
 public static void main(String[] args){
     Emp e= new Emp();
     e.setEid(2);
    e.setEname("siri");
    System.out.println(e.getEid());
    System.out.println(e.getEname());
 }
}
