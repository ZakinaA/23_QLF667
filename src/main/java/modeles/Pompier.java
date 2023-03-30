/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.ArrayList;

/**
 *
 * @author noa.hervieu
 */
public abstract class Pompier {
    
    private int id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private int numeroBip;
    private Grade grade;
    private ArrayList<Fonction> listeFonction;
    private ArrayList<Caserne> listeCaserne;
    private ArrayList<Intervention> listeIntervention;
    
    
    public Pompier(){}
    
    public Pompier(int id, String nom, String prenom, String dateNaissance, int numeroBip){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numeroBip = numeroBip;
    }

    /*GETTERS & SETTERS*/
    
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getNumeroBip() {
        return numeroBip;
    }

    public void setNumeroBip(int numeroBip) {
        this.numeroBip = numeroBip;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public ArrayList<Fonction> getListeFonction() {
        return listeFonction;
    }

    public void setListeFonction(ArrayList<Fonction> listeFonction) {
        this.listeFonction = listeFonction;
    }

    public ArrayList<Caserne> getListeCaserne() {
        return listeCaserne;
    }

    public void setListeCaserne(ArrayList<Caserne> listeCaserne) {
        this.listeCaserne = listeCaserne;
    }

    public ArrayList<Intervention> getListeIntervention() {
        return listeIntervention;
    }

    public void setListeIntervention(ArrayList<Intervention> listeIntervention) {
        this.listeIntervention = listeIntervention;
    }
    
    public void addUneFonction(Fonction uneFonction) {
        if (listeFonction == null) { // Si la liste n'est pas existante on en crée une
                listeFonction = new ArrayList<Fonction>();
        } // Et on ajoute le pompier à la liste
        listeFonction.add(uneFonction);
    }
    
    public void addUneCaserne(Caserne uneCaserne) {
        if (listeCaserne == null) { // Si la liste n'est pas existante on en crée une
                listeCaserne = new ArrayList<Caserne>();
        } // Et on ajoute le pompier à la liste
        listeCaserne.add(uneCaserne);
    }
    
    public void addUneFonction(Intervention uneIntervention) {
        if (listeIntervention == null) { // Si la liste n'est pas existante on en crée une
                listeIntervention = new ArrayList<Intervention>();
        } // Et on ajoute le pompier à la liste
        listeIntervention.add(uneIntervention);
    }
    
}
