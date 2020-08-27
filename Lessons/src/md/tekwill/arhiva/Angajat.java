package md.tekwill.arhiva;

public class Angajat {
     String nume="Ion";
     long virsta=56;

    Angajat() {

    }

    long damiVirsta() {
        return virsta;
    }

    void printeazaNume() {
        System.out.println(virsta);
    }

    void seteazaVirsta(long argumentVirsta) {
        virsta = argumentVirsta;
    }

    void printeazaVirstaSiNume() {
        System.out.println("Virsta: " +virsta + " " + "Nume " + nume);
    }




}
