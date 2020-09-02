package md.tekwill.lectia12;


public class Clasa132 {

    int x;
    String s;
    float f;

    Clasa132(int x) {
        System.out.println("Este  Clasa132(int x) !");
        this.x = x;
        this.s = "Ura!";
        this.f = 10.2f;
    }

    Clasa132(int x, String s) {
        this(x);
        System.out.println("Este  Clasa132(int x,String s) !");
        this.s = s;
    }

    Clasa132(String s, int x, float f) {
        this(x, s);
        System.out.println("Este  Clasa132(int x,String s,float f) !");
        this.f = f;
    }

    Clasa132() {

    }

    public static void main(String[] args) {
//       Clasa132 obj1 = new Clasa132(123);
//        Clasa132 obj2 = new Clasa132(123, "Ura!");
        Clasa132 obj3 = new Clasa132("proba", 100, 12.1f);
//       Clasa132 obj4 = new Clasa132();
    }

}

