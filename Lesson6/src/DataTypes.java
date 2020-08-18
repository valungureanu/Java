/**
 *  Aceasta clasa este de
 *
 *
 *
 * */
public class DataTypes {
    public static void main(String[] parms) {
        DataTypes obiectTipuri = new DataTypes();
        DataTypes obiectTipuri1 = new DataTypes();

        byte b = 60;
        short s = 50;
        int i = 400000;
        long l = 1000000L;
        float f = 12.5f;
        double d = 13;
        char c = 'A';
        String s1 = "ss";
        boolean bool = true;

        int a1 = 10;
        int b1 = 20;
        int sum = a1 + b1;

        long ii=1234567890123456L;
        float ff=ii; // se compilează

        System.out.println(ii);
        System.out.println(ff);

        int x = 102_567_345;

        System.out.println((int)'a');

        double dd = 15.4;
        int id = (int) dd;
        System.out.println(id);

        float fff =40f;
        int iii = (int) fff;
        System.out.println(iii);

        System.out.printf(true+"Salut");
        // Acesta este un comentariu de o singura linie
/*  1
    2
    3
 */

        String concatString = "String1" + "String2";

        System.out.println(d + "  " + f);


    }
}
