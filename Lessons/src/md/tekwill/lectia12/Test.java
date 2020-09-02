package md.tekwill.lectia12;

public class Test {
    String nume;
    {
        System.out.println("Bloc de initialisare non-static");
    }

    static {
        System.out.println("Bloc de initialisare  static / de clasa");
    }

    Test(){
        System.out.println("Bloc de initializare de instanta");
    }

    public static void m1(){
//        this.nume = "Ion";
    };
    public void m2(){
        this.nume = "Ion";
        m1();
    };

    public static void main(String[] args) {

        Test obj = new Test();
    }
}
