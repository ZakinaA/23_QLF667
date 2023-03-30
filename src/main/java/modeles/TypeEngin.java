/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.ArrayList;

/**
 *
 * @author louane.roussel
 */
public class TypeEngin {
    private String code;
    private String libelle;
    private ArrayList listEngin;
    
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

    public ArrayList getListEngin() {
        return listEngin;
    }

    public void setListEngin(ArrayList listEngin) {
        this.listEngin = listEngin;
    }
    
    public void addUnEngin(Engin pUnEngin){
        if (listEngin==null){
            listEngin=new ArrayList<Engin>(); 
        }
        listEngin.add(pUnEngin);
    }
}
