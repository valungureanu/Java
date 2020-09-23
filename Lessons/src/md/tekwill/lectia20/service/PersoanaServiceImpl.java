/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import dao.PersoanaDao;
import model.Persoana;
/**
 *
 * @author Valeriu Ungureanu
 */
public class PersoanaServiceImpl {
    PersoanaDao persoanaDao = (PersoanaDao) new dao.PersoanaDaoImpl();

    public void addPersoana(Persoana persoana) {
        persoanaDao.addPersoana(persoana);
    }

    public Persoana read(int id) {
        return persoanaDao.read(id);
    }

    public Persoana[] readAll() {
        return  persoanaDao.readAll();
    }

    public void update(int id) {
        persoanaDao.update(id);
    }

    public void delete(int id) {
        persoanaDao.delete(id);
    }

    public void printeazaToatePersoanele() {
        persoanaDao.printeazaToatePersoanele();
    }
}
