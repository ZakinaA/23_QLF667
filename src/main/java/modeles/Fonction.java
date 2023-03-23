/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeles;

/**
 *
 * @author noa.hervieu
 */
public class Fonction {
    
    private String code;
    private String libelle;

    
    //Constructeur
    public Fonction() {
    }
    
    public Fonction(String code, String libelle) {
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

    
    
    
}
