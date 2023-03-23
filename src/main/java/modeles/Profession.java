/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeles;

/**
 *
 * @author noa.hervieu
 */
public class Profession {
    
    private String code;
    private String libelle;
    private String ville;

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
    
    
    
}
