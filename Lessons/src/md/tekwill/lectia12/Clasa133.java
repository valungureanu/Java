package md.tekwill.lectia12;

public class Clasa133 {

    private void metoda1331(Clasa133 obj) {

        System.out.println("Obj -> " + obj);

    }

    public void metoda1332() {

        System.out.println(this);
        this.metoda1331(this);
        this.metoda1331(new Clasa133());

    }



    public static void main(String[] args) {
        Clasa133 obj1 = new Clasa133();
        obj1.metoda1332();
    }

}
