public class l9_temaPeAcasa {

    static long n;

    static void hello10() {
        for (int i = 1; i <= 10; i++) System.out.println("Hello " + i + " !!!");
    }

    static void suma(long n) {
        long sum = 0l;
        for (int i = 0; i <= n; ++i) {
            sum += i;
        }
        System.out.println("Suma numerelor de la 1 la " + n + " este egala cu: " + sum);
        return;
    }


    static void numerePare(long n) {
        if (n > 1) {
            System.out.println("Numerele pare care nu sunt mai mari decat " + n + "!!!");
            int i = 0;
            while (i <= n) {
                System.out.println(i);
                i += 2;
            }
            return;
        } else System.out.println("Introduce un numar intreg mai mare decat 1!");

    }

    static void numereImpare(long n) {
        if (n > 0) {
            System.out.println("Numerele impare care nu sunt mai mari decat " + n + "!!!");
            int i = 1;
            do {
                System.out.println(i);
                i += 2;
            } while (i <= n);
            return;
        } else System.out.println("Introduce un numar intreg mai mare decat 0!");

    }


    public static void main(String[] params) {

        System.out.println();

        hello10();

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

        n = 10000;
        suma(n);

        n = 11;
        numerePare(n);

        n = 7;
        numereImpare(n);

    }

}
