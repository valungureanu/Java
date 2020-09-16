package md.tekwill.lectia16.model;


public class Persoana {

    public static int contorPersoane;

    private int id;
    private String nume;
    private String preNume;

    private static int countId;

    public Persoana(String nume, String preNume) {
        this.nume = nume;
        this.preNume = preNume;
        countId++;
        this.id = countId;
    }
    public int getID(){
        return this.id;
    }
    public String getNume(){
        return this.nume;
    }
    public String getPrenumme(){
        return this.preNume;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", preNume='" + preNume + '\'' +
                '}';
    }
}
