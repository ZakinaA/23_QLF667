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
public class Profession {
    
    private String code;
    private String libelle;
    private String ville;
    private ArrayList<Volontaire> listeVolontaire;

    //Constructeur
    public Profession() {
    }

    public Profession(String code, String libelle, String ville) {
        this.code = code;
        this.libelle = libelle;
        this.ville = ville;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public ArrayList<Volontaire> getListeVolontaire() {
        return listeVolontaire;
    }

    public void setListeVolontaire(ArrayList<Volontaire> listeVolontaire) {
        this.listeVolontaire = listeVolontaire;
    }
}
