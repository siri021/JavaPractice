package Inheritance;

abstract public class Dogs {// abstract class

    abstract void sound();// abstract method

    void display() {
        System.out.println("I am from dog class");
    }
}
class Cat extends Dogs{
    public void sound(){
        System.out.println("barking");
    }
    public static void main(String[] args){
        Cat c= new Cat();
        c.sound();
        c.display();
    }

}


