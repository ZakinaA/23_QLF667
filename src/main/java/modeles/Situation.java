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
public class Situation {
    private int id;
    private String libelle;
    private ArrayList listEngin ; 
    private ArrayList listIntervention ;
    private Engin engin ;
    private Intervention intervention ;
    
    public Situation() {
    }

    public ArrayList getListEngin() {
        return listEngin;
    }

    public void setListEngin(ArrayList listEngin) {
        this.listEngin = listEngin;
    }

    public Situation(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public ArrayList getListIntetvention() {
        return listIntervention;
    }

    public void setListIntetvention(ArrayList listIntetvention) {
        this.listIntervention = listIntetvention;
    }

    public ArrayList getListIntervention() {
        return listIntervention;
    }

    public void setListIntervention(ArrayList listIntervention) {
        this.listIntervention = listIntervention;
    }

    public Engin getEngin() {
        return engin;
    }

    public void setEngin(Engin engin) {
        this.engin = engin;
    }

    public Intervention getIntervention() {
        return intervention;
    }

    public void setIntervention(Intervention intervention) {
        this.intervention = intervention;
    }
    
    public void addUnEngin(Engin pUnEngin){
        if (listEngin==null){
            listEngin=new ArrayList<Engin>(); 
        }
        listEngin.add(pUnEngin);
    }
    
    public void addUneIntervention(Intervention pUneIntervention){
        if (listIntervention==null){
            listIntervention=new ArrayList<Intervention>(); 
        }
        listIntervention.add(pUneIntervention);
    }
}
