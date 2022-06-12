public class Instance2 {
    void m2() {
        Instance1 i = new Instance1();
        System.out.println(i.x);
        i.m1();
    }
        public static void main(String[] args){
        Instance2 i1 = new Instance2();
        i1.m2();

        }

    }

