/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeles;
import java.util.ArrayList;

/**
 *
 * @author louane.roussel
 */
public class Caserne {
 private int id;
    private String nom;
    private String adresse;
    private String ville;
    private String cp;
    private ArrayList listEngins;
    private Pompier pompier ;
    
    public Caserne() {
    }

    public Caserne(int id, String nom, String adresse, String ville, String cp) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.ville = ville;
        this.cp = cp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public ArrayList getListEngins() {
        return listEngins;
    }

    public void setListEngins(ArrayList listEngins) {
        this.listEngins = listEngins;
    }

    public Pompier getPompier() {
        return pompier;
    }

    public void setPompier(Pompier pompier) {
        this.pompier = pompier;
    }
    
    public void addUnEngin(Engin pUnEngin){
        if (listEngins==null){
            listEngins=new ArrayList<Engin>(); 
        }
        listEngins.add(pUnEngin);
    }
    
}
