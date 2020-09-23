/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Persoana;

import java.util.Scanner;

/**
 * @author Valeriu Ungureanu
 */

public class PersoanaDaoImpl implements dao.PersoanaDao {

    public Persoana[] persoane = new Persoana[20];

    @Override
    public Persoana addPersoana(Persoana persoana) {            // adaugarea unei persoane in array
        if (Persoana.contorPersoane < persoane.length) {
            persoane[Persoana.contorPersoane++] = persoana;
            return persoana;
        }
        System.out.println("A fost depasita lungimea admisibila");
        return null;
    }

    public Persoana read(int id) {                          // gasirea persoanei cu id de la argument in array
        for (int i = 0; i < Persoana.contorPersoane; i++) {
            if (id == persoane[i].getID()) {
                return persoane[i];
            }
        }
        return null;
    }

    public Persoana[] readAll() {                       // returnarea tuturor persoanelor din array
        Persoana[] persoaneExistente = new Persoana[Persoana.contorPersoane];
        for (int i = 0; i < Persoana.contorPersoane; i++) {
            persoaneExistente[i] = persoane[i];
        }
        return persoaneExistente;
    }

    public void update(int id) {
        for (int i = 0; i < Persoana.contorPersoane; i++) {
            if (id == persoane[i].getID()) {
                System.out.println("Persoana cu ID = " + id + " a fost gasita");
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Introduceti numele nou:");
                String nume1 = myObj.nextLine();  // introducem numele
                System.out.println("Introduceti prenumele nou: ");  // Output user input
                String prenume1 = myObj.nextLine();  // introducem numele
                persoane[id - 1].writeNume(nume1);
                persoane[id - 1].writePrenume(prenume1);
                System.out.println("Datele persoanei au fost improspatate cu succes");
            }
        }
        // 1. cautare dupa id
        // 2. persoanei gasite i se updateaza datele
        // 3. persoana cu noile date se salveaza inapoi in array
    }

    public void delete(int id) {
        for (int i = 0; i < Persoana.contorPersoane; i++) {
            if (id == persoane[i].getID()) {
                for (int j = id; j < Persoana.contorPersoane-1; j++) {
                    System.out.println("Acum stergem persoana cu ID = " + id);
                    persoane[j] = persoane[j + 1]; // Ultima persoana o punem in locul persoanei sterse
                }
                Persoana.contorPersoane--;
            }
        }
        // 1. cautare dupa id
        // 2. persoana gasita se sterge din array
    }

    public void printeazaToatePersoanele() {
        // printati toate datele din array
        if (Persoana.contorPersoane == 0) {
            System.out.println("Eroare !! Nu sunt inregistrate careva persoane !!");
        } else {
            System.out.println("Acum sunt inregistrate persoanele:");
            for (int i = 0; i < Persoana.contorPersoane; i++) {
                System.out.println("ID: " + persoane[i].getID() + "; Nume: " + persoane[i].getNume() + "; Prenume: " + persoane[i].getPreNume());
            }
        }
    }

}
