/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Valeriu Ungureanu
 */
public class Persoana {
    private int id;
    private String nume;
    private String preNume;
    public static int countId;
    public static int contorPersoane;

    public Persoana(String nume, String preNume) {
        this.nume = nume;
        this.preNume = preNume;
        countId++;
        this.id = countId;
    }

    public int getID(){
        return this.id;
    }
    public String getNume(){
        return this.nume;
    }
    public String getPreNume(){
        return this.preNume;
    }
    public void writeNume(String nume1){ this.nume = nume1; }
    public void writePrenume(String prenume1){ this.preNume = prenume1; }


    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", preNume='" + preNume + '\'' +
                '}';
    }
}
