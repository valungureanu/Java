package md.tekwill.lectia16.dao;

import md.tekwill.lectia16.model.Persoana;

public class PersoanaDao {
    public Persoana[] listPersoane = new Persoana[20];

    public void create(Persoana persoana) {
        //logica de adaugare a persoanei in array
    }

    public Persoana read(int id) {
        //logica de gasire a persoanei cu id de la argument in array
        return null;
    }

    public Persoana[] readAll() {
        //logica de returnare a tuturor persoanelor din array
        return null;
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

    public void printeazaToatePersoanele(){
        // printati toate datele din array
//        System.out.println();
    }

}