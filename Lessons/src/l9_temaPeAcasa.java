public class l9_temaPeAcasa {

    public static void main(String[] params) {

        System.out.println();

        Student student1 = new Student();

        student1.prenume = "Mihai";
        student1.nume = "Ungureanu";
        student1.virstaAni = 20L;
        student1.curs = 3;
        student1.grupa = 'I';

        System.out.println(student1.prenumeNume(student1.prenume, student1.nume));
        System.out.println("Virsta este circa: " + student1.luniTraite(student1.virstaAni) + " de luni!!");
        System.out.println("Invata in cursul: " + student1.printCurs(student1.curs));
        System.out.println("E student al grupei numarul: " + student1.printGrupa(student1.grupa));

        System.out.println();

        Student student2 = new Student();

        student2.prenume = "Dorin";
        student2.nume = "Ungureanu";
        student2.virstaAni = 30L;
        student2.curs = 2;
        student2.grupa = 'E';

        System.out.println(student2.prenumeNume(student2.prenume, student2.nume));
        System.out.println("Virsta este circa: " + student2.luniTraite(student2.virstaAni) + " de luni!!");
        System.out.println("Invata in cursul: " + student2.printCurs(student2.curs));
        System.out.println("E student al grupei numarul: " + student2.printGrupa(student2.grupa));

        System.out.println();

        Student student3 = new Student();

        student3.prenume = "Valeriu";
        student3.nume = "Ungureanu";
        student3.virstaAni = 12L;
        student3.curs = 10;
        student3.grupa = 'M';

        System.out.println(student3.prenumeNume(student3.prenume, student3.nume));
        System.out.println("Virsta este circa: " + student3.luniTraite(student3.virstaAni) + " de luni!!");
        System.out.println("Invata in cursul: " + student3.printCurs(student3.curs));
        System.out.println("E student al grupei numarul: " + student3.printGrupa(student3.grupa));

        System.out.println();

        long n = 10000;
        System.out.println(student3.suma(n));

        n = 51;
        student1.numerePare(n);

        n = 51;
        student1.numereImpare(n);

        student2.hello10();

    }

}
