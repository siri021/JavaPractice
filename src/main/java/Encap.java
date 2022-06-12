public class Encap {
private String ename;
private int eno;
public String getEname(){
    return ename;


}
public void setEname(String ename){
    this.ename=ename;
}
public int getEno(){
    return eno;
}
public void setEno(int eno){
    this.eno =eno;
}
public static void main(String[] args){
    Encap e= new Encap();
    e.setEname("siri");
    e.setEno(12);
    System.out.println(e.getEname());
    System.out.println(e.getEno());
}
}
