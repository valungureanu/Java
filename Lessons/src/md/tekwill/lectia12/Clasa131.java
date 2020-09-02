package md.tekwill.lectia12;

public class Clasa131 {

    int x;
    String s;
    float f;

    Clasa131(int x) {
        this.x = x;
        this.s = "Ura!";
        this.f = 10.2f;
    }

    Clasa131(int x, String s) {
        this.x = x;
        this.s = s;
    }

    Clasa131(String s, int x, float f) {
        this.x = x;
        this.s = s;
        this.f = f;
    }

    Clasa131() {

    }

    public static void main(String[] args) {
        Clasa131 obj1 = new Clasa131(123);
        Clasa131 obj2 = new Clasa131(123, "Ura!");
        Clasa131 obj3 = new Clasa131("proba", 100, 12.1f);
        Clasa131 obj4 = new Clasa131();
    }

}
