/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Persoana;

/**
 *
 * @author Valeriu Ungureanu
 */
public interface PersoanaDao {

    Persoana create(Persoana persoana);

    public Persoana addPersoana(Persoana persoana);

        model.Persoana read(int id);

        model.Persoana[] readAll();

        void update(int id);

    void update(int id, String nume, String prenume);

    void delete(int id);

        void printeazaToatePersoanele();
}
