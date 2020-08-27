package md.tekwill.pachet2;

import md.tekwill.pachet3.Clasa4;
import md.tekwill.pachet3.Clasa6;

public class Clasa5 {
    public static void main(String[] args) {

        Clasa6 obj1 = new Clasa6();

        System.out.println(obj1.citireProp16());
        System.out.println(obj1.citireProp26());

        obj1.setareProp16(200);
        obj1.setareProp26(300);

        System.out.println(obj1.citireProp16());
        System.out.println(obj1.citireProp26());

    }
}
