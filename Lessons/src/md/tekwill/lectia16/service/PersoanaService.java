package md.tekwill.lectia16.service;

import md.tekwill.lectia16.dao.PersoanaDao;
import md.tekwill.lectia16.model.Persoana;

public class PersoanaService {
    PersoanaDao persoanaDao = new PersoanaDao();
//    AdresaDao adresaDao = new AdresaDao();

    public Persoana create(Persoana persoana) {
        return persoanaDao.create(persoana);
    }

    public Persoana read(int id) { return persoanaDao.read(id); }

    public Persoana[] readAll() {
        return persoanaDao.readAll();
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
