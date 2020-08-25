package md.tekwill.pachet3;

import md.tekwill.pachet1.Clasa1;
import md.tekwill.pachet2.Clasa2;

public class Clasa3 {
    public static void main(String[] args) {
        Clasa1 ob1 = new Clasa1();
        ob1.met11();
        // ob1.met21();//java: met21() has protected access in md.tekwill.pachet1.Clasa1
        //ob1.met31();//java: met31() is not public in md.tekwill.pachet1.Clasa1; cannot be accessed from outside package
        //ob1.met41();//java: met41() has private access in md.tekwill.pachet1.Clasa1

        Clasa2 ob2 = new Clasa2();
        ob2.met12();
        //ob2.met22();
        //ob2.met32();
        //ob2.met42();
    }

}
