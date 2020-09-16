/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import model.Persoana;
import service.PersoanaServiceImpl;

import java.util.Arrays;

public class TestNoUI {
    public static void main(String[] args) {
        PersoanaServiceImpl service = new PersoanaServiceImpl();
        Persoana persoana1 = new Persoana("Ion", "Bostan");
        service.create(persoana1);
        Persoana persoana2 = new Persoana("Vasile", "Botnari");
        service.create(persoana2);
        Persoana persoana3 = new Persoana("John", "Snow");
        service.create(persoana3);
        Persoana persoana4 =  service.read(30);
//        System.out.println(persoana3);
        service.printeazaToatePersoanele();
//        System.out.println(Arrays.toString(service.readAll()));
//        service.update(2);
//        service.read(2);
//        service.printeazaToatePersoanele();
        service.delete(2);
        service.printeazaToatePersoanele();
        Persoana persoana5 = new Persoana("Vasile", "Botnari");
        service.create(persoana5);
        System.out.println("Am creat o noua persoana");
        service.printeazaToatePersoanele();
    }
}