/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeles;

import java.util.ArrayList;

/**
 *
 * @author noa.hervieu
 */
public class Grade {
    
    private String code;
    private String libelle;
    private ArrayList<Pompier> listePompier;

    
    //Constructeur
    public Grade() {
    }

    public Grade(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    //GETTER & SETTER
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public ArrayList<Pompier> getListePompier() {
        return listePompier;
    }

    public void setListePompier(ArrayList<Pompier> listePompier) {
        this.listePompier = listePompier;
    }
    
   
}
