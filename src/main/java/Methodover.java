public class Methodover {
    void m1(int x, int y) {
        System.out.println("Result:" + (x + y));

        }

        void m1(int z){
        System.out.println("Result:"+(z));

        }
        public static void main(String[] args){
        Methodover m = new Methodover();
        m.m1(2,1);
        m.m1(4);
        }
    }

