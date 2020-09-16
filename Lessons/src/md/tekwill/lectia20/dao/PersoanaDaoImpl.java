/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Persoana;
import java.util.Scanner;

/**
 *
 * @author Vadim
 */

public class PersoanaDaoImpl implements dao.PersoanaDao {

    public Persoana[] listPersoane = new Persoana[20];

    @Override
    public Persoana create(Persoana persoana) {
        if (Persoana.contorPersoane < listPersoane.length) {
            listPersoane[Persoana.contorPersoane++] = persoana;
            return persoana;
        }
        System.out.println("A fost depasita lungimea admisibila");
        return null;
        //logica de adaugare a persoanei in array
    }

    public Persoana read(int id) {
        for (int i = 0; i < Persoana.contorPersoane; i++) {
            if (id == listPersoane[i].getID()) {
                return listPersoane[i];
            }
        }
        //logica de gasire a persoanei cu id de la argument in array
        return null;
    }

    public Persoana[] readAll() {
        Persoana[] persoaneExistente = new Persoana[Persoana.contorPersoane];
        for (int i = 0; i < Persoana.contorPersoane; i++) {
            persoaneExistente[i] = listPersoane[i];
        }
        //logica de returnare a tuturor persoanelor din array
        return persoaneExistente;
    }

    public void update(int id) {
        for (int i = 0; i < Persoana.contorPersoane; i++) {
            if (id == listPersoane[i].getID()) {
                System.out.println("Persoana cu ID = " + id + " a fost gasita");
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Introduceti numele nou:");
                String nume1 = myObj.nextLine();  // introducem numele
                System.out.println("Introduceti prenumele nou: ");  // Output user input
                String prenume1 = myObj.nextLine();  // introducem numele
                listPersoane[id - 1].writeNume(nume1);
                listPersoane[id - 1].writePrenume(prenume1);
                System.out.println("Datele persoanei au fost improspatate cu succes");
            }
        }
        // 1. cautare dupa id
        // 2. persoanei gasite i se updateaza datele
        // 3. persoana cu noile date se salveaza inapoi in array
    }

    public void delete(int id) {
        for (int i = 0; i < Persoana.contorPersoane; i++) {
            if (id == listPersoane[i].getID()) {
//                for (int i11 = id; i11 < Persoana.contorPersoane; i11++) {
                System.out.println("Acum stergem persoana cu ID = " + id);
                listPersoane[id - 1].writeNume(listPersoane[Persoana.contorPersoane - 1].getNume()); // Ultima persoana o punem in locul persoanei sterse
                listPersoane[id - 1].writePrenume(listPersoane[Persoana.contorPersoane - 1].getPreNume());
                Persoana.contorPersoane--;
                Persoana.countId--;
//                }
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
                System.out.println("ID: " + listPersoane[i].getID() + "; Nume: " + listPersoane[i].getNume() + "; Prenume: " + listPersoane[i].getPreNume());
            }
        }
    }

}
