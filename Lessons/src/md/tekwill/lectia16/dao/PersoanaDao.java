package md.tekwill.lectia16.dao;

import md.tekwill.lectia16.model.Persoana;

public class PersoanaDao {
    public Persoana[] listPersoane = new Persoana[20];


    public Persoana create(Persoana persoana) {
        if (Persoana.contorPersoane < listPersoane.length) {
            listPersoane[Persoana.contorPersoane++] = persoana;
            return persoana;
        }
        System.out.println("A fost depasta lumgimea admisibila");
        return null;
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

    public boolean update(int id) {
        // 1. cautare dupa id
        // 2. persoanei hasite i se updateaza datele
        // 3. persoana cu noile date se salveaza inapoi in array
        return false;
    }

    public void delete(int id) {
        // 1. cautare dupa id
        // 2. persoana gasita se sterge din array
    }

    public void printeazaToatePersoanele() {
        for (int i = 0; i < Persoana.contorPersoane; i++) {
            System.out.println("ID " + listPersoane[i].getID());
            System.out.println("ID " + listPersoane[i].getNume());
            System.out.println("ID " + listPersoane[i].getPrenumme());
        }
    }

}