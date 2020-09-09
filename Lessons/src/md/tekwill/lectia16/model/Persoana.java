package md.tekwill.lectia16.model;


public class Persoana {
    private int id;
    private String nume;
    private String preNume;
    Adresa adresa;
    private static int countId;

    public Persoana(String nume, String preNume) {
        this.nume = nume;
        this.preNume = preNume;
        countId++;
        this.id = countId;
    }
}
