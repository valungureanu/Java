public class l8_breakLabel {
    public static void main(String[] params) {
        compare:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println(j);
                if (j == 3) {
                    break compare;
                }
            }
        }

        outer:
        for (int ii = 0; ii < 5; ii++) {
            for (int jj = 0; jj < 7; jj++) {
                System.out.println(jj);
                if (jj == 3) {
                    continue outer;
                }
            }
        }

        //       primul:
        //       {
        //           doi:
        //           {
        //               break primul;
        //               if();
        //           }
        //       }

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

    }
}
