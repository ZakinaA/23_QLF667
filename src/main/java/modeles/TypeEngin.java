/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

/**
 *
 * @author louane.roussel
 */
public class TypeEngin {
    private String code;
    private String libelle;

    public TypeEngin(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public TypeEngin() {
    }

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
