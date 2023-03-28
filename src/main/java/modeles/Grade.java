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
    
    public void addUnPompier(Pompier pUnPompier) {
        if (listePompier == null) { // Si la liste n'est pas existante on en crée une
                listePompier = new ArrayList<Pompier>();
        } // Et on ajoute le pompier à la liste
        listePompier.add(pUnPompier);
    }
   
}
