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

    String suma(long n) {
        long sum = 0l;
        for (int i = 0; i <= n; ++i) {
            sum += i;
        }
        return "Suma numerelor de la 1 la " + n + " este egala cu: " + sum;
    }


    void numerePare(long n) {
        if (n > 1) {
              for (int i = 2; i <= n; i+=2) {
                  System.out.println(i);
            }
            return ;
        }  else System.out.println("Introduce un numar intreg mai mare decat 1!");

    }

    void numereImpare(long n) {
        if (n > 0) {
            for (int i = 1; i <= n; i+=2) {
                System.out.println(i);
            }
            return ;
        }  else System.out.println("Introduce un numar intreg mai mare decat 0!");

    }

    void hello10(){
        for(int i=1;i<=10;i++) System.out.println("Hello "+i+" !!!");
    }

}



