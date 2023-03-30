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
public class Engin {
    private int id ;
    private String libelle ;
    private ArrayList listTypeEngin ;
    private ArrayList listSituations;
    private Caserne caserne;
    private Situation situation;
    
    public Engin() {
    }

    public Engin(int id, String libelle) {
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
    
    public ArrayList getListSituations() {
        return listSituations;
    }

    public void setListSituations(ArrayList listSituation) {
        this.listSituations = listSituation;
    }

    public Caserne getCaserne() {
        return caserne;
    }

    public void setCaserne(Caserne caserne) {
        this.caserne = caserne;
    }

    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }
    
    public void addUneSituation(Situation pUneSituation){
        if (listSituations==null){
            listSituations=new ArrayList<Situation>(); 
        }
        listSituations.add(pUneSituation);
    }
    
     public void addUnTypeEngin(TypeEngin pUnTypeEngin){
        if (listTypeEngin==null){
            listTypeEngin=new ArrayList<TypeEngin>(); 
        }
        listTypeEngin.add(pUnTypeEngin);
    }
}
