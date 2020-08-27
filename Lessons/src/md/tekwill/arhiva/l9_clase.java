package md.tekwill.arhiva;

public class l9_clase {
    public static void main(String[] params) {
        Angajat angajat = new Angajat();
        angajat.printeazaVirstaSiNume();
        long virsta = angajat.damiVirsta();
        long suma = virsta + 25;
        System.out.println(virsta);
        angajat.printeazaNume();
        angajat.seteazaVirsta(20l);

        Angajat angajat2 = new Angajat();
        System.out.println(angajat2.damiVirsta());
        angajat2.nume="Mihai";
        System.out.println(angajat2.nume);

        System.out.println(angajat);
        System.out.println(angajat2);

        Angajat angajat1 = new Angajat();
        angajat1.damiVirsta();

        angajat1 = angajat;
        angajat1.damiVirsta();

    }
}
