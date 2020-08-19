public class conditionaleSiCicluri {

    public static void main(String[] args) {
        if (5 < 7) {

            System.out.println("Primul Printe");
        } else if (true) {

            System.out.printf("else if");
        }


        int count = 0;
        if (count > 5 & ++count < 20) {
            ++count;
        }


        if (true) {
            System.out.printf("Primul if");
            if (false) {
                System.out.printf("Al 2-lea if");
            } else {
                System.out.printf("Else pentru iful interior");
            }
        } else {
            System.out.printf("Else pentru iful exterior");
        }

        switch ('c') {
            case 'a': {//statements
                System.out.printf("a");
                break; //optional
            }
            case 'b': {//statements
                System.out.printf("b");
                break; //optional
            }
            case 'c': {//statements
                System.out.printf("\nc");
                break; //optional
            }

            default: {//statements;
                System.out.printf("Nu-i valabila nici o varianta");
            }

        }


        //Operatoryk ternar


        String mesaj = 5 > 3 ? "5 este mai mare decat 3" : "3 este mai mare decat 5";
        System.out.printf("\n" + mesaj);

        /* Cicluri
         */

        int count2 = 1;


        while (count2 <= 5) {
            System.out.println("Printeaza " + count2++);
        }

        do {
            System.out.println("Printeaza " + count2++);
        } while (count2 <= 5);

        for (int i1 = 0; i1 <= 5; i1++) {
            System.out.println(i1);
        }

    }
}
