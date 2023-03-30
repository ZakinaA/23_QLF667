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

    public ArrayList<Fonction> getFonction() {
        return listeFonction;
    }

    public void setFonction(ArrayList<Fonction> fonction) {
        this.listeFonction = fonction;
    }
    
    public void addUneFonction(Fonction uneFonction) {
        if (listeFonction == null) { // Si la liste n'est pas existante on en crée une
                listeFonction = new ArrayList<Fonction>();
        } // Et on ajoute le pompier à la liste
        listeFonction.add(uneFonction);
    }
    
}
