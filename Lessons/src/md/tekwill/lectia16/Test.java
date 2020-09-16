package md.tekwill.lectia16;

import md.tekwill.lectia16.model.Persoana;
import md.tekwill.lectia16.service.PersoanaService;

import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        PersoanaService service = new PersoanaService();

        Persoana persoana1 = new Persoana("Ion", "Bostan");
        service.create(persoana1);

        Persoana persoana2 = new Persoana("Ilie", "Doibani");
        service.create(persoana2);

//        Persoana persoana3 = service.read(1);
//
//        System.out.println(persoana3);

//        service.printeazaToatePersoanele();


        System.out.println(Arrays.toString(service.readAll()));


    }
}