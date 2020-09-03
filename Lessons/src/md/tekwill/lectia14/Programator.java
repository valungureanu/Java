package md.tekwill.lectia14;

public class Programator extends Angajat {
    public int id = 20;
    int bonus;
    public static final int NR_DE_ORE_LUCRATE;

    static {
        NR_DE_ORE_LUCRATE = 20;
    }

//    {
//        NR_DE_ORE_LUCRATE = 20;
//    }

//    Programator(){
//    NR_DE_ORE_LUCRATE=30;
//    }

//    public void changeFinal(final int x){
//        x+=2; //can't do that
//    }

    public void m1(String s) {
        //this.bonus=20;
        System.out.println("Metoda din Programator");
    }

    @Override
    public void m1() {
        super.m1();
        System.out.println("Metoda din Programator");
    }

    public void printClassName() {
        System.out.println(this.getClass().getName());
    }

    public String toString() {
        return "bonus: " + "is " + bonus;//"Comportament schimbat";
    }
}
