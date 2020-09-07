package md.tekwill.lectia15;

public class ClasaB extends ClasaA {
    private int iB;
    private long lB;
    private float fB;
    public String s = "ClasaB extinde clasa A!";

    @Override
    void metodaAP() {
        super.metodaAP();
        System.out.println(s + "  Produseul variabilelor din ClasaB: " + (iB * lB * fB));
    }

    @Override
    void metodaAS() {
        super.metodaAS();
        System.out.println(s + "  Suma variabilelor din ClasaB: " + (iB + lB + fB));
    }

    @Override
    void metodaAC() {
        super.metodaAC();
        System.out.println(s + "  Concatenarea variabilelor din ClasaB: " + iB + lB + fB);
    }

    public ClasaB(){
        iB = 22;
        lB = 222;
        fB = 222.22f;
    }

}
