package md.tekwill.pachet3;

public class Clasa4 {

    public static void met14() {
        System.out.println("Metoda 1 din Pachetul 4");
        met24();
        met34();
    }

    private static void met24() {
        System.out.println("Metoda 2 din Pachetul 4");
    }

    private static void met34() {
        System.out.println("Metoda 3 din Pachetul 4");
    }

    public static void main(String[] args) {
        met14();
    }
}
