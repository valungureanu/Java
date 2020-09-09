package md.tekwill.lectia16.service;

import md.tekwill.lectia16.dao.PersoanaDao;
import md.tekwill.lectia16.model.Persoana;

public class PersoanaService {
    PersoanaDao persoanaDao = new PersoanaDao();
//    AdresaDao adresaDao = new AdresaDao();

    public void create(Persoana persoana) {
        persoanaDao.create(persoana);
    }

    public Persoana read(int id) {
        return null;
    }

    public Persoana[] readAll() {
        return null;
    }

    public boolean update(int id) {
        return false;
    }

    public void delete(int id) {
        persoanaDao.delete(id);
    }

    public void printeazaToatePersoanele() {
        persoanaDao.printeazaToatePersoanele();
    }
}
