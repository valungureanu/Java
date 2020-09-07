package md.tekwill.lectia15;

public class ClasaA {
    int i;
    long l;
    float f;

    void metodaAS(){
        System.out.println("Suma variabilelor din ClasaA: "+(i+l+f));
    }

    void metodaAP(){
        System.out.println("Produsul variabilelor din ClasaA: "+i*l*f);
    }

    void metodaAC(){
        System.out.println("Concatenarea variabilelor din ClasaA: "+i+l+f);
    }

    public ClasaA(){
        i = 1;
        l = 1;
        f = 1.1f;
    }

    public ClasaA(int ii){
        i = ii;
        l = 2;
        f = 2.2f;
    }

    public ClasaA(int ii, int ll){
        i = ii;
        l = ll;
        f = 2.2f;
    }

    public ClasaA(int ii, int ll, float ff){
        i = ii;
        l = ll;
        f = ff;
    }

}
