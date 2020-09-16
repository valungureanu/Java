/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Persoana;

/**
 *
 * @author Vadim
 */
public interface PersoanaDao {
        public Persoana create(Persoana persoana);

        model.Persoana read(int id);

        model.Persoana[] readAll();

        void update(int id);

        void delete(int id);

        void printeazaToatePersoanele();
}
