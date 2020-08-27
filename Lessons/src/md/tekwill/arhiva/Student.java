package md.tekwill.arhiva;

public class Student {

    String prenume, nume;
    long virstaAni;
    int curs;
    char grupa;

    Student() {

    }

    String prenumeNume(String prenume, String nume) {
        return "Numele complet al studentului este: " + prenume + " " + nume;
    }

    int luniTraite(long virstaAni) {
        return 12 * (int) virstaAni;
    }

    int printCurs(int curs) {
        return curs;
    }

    char printGrupa(char grupa) {
        return grupa;
    }

}



