/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ts1sio
 */
public class Responsable extends Utilisateur {
    
    private List<Utilisateur> pompiers;

    public Responsable() {
    }
    
 
    public Responsable(String nom, String prenom, String poste) {
        super(nom, prenom, poste);
        pompiers = new ArrayList<>();
        }
    
    public List<Utilisateur> getPompiers() {
        return pompiers;
    }
    
    public void afficherPompiers() {
        for (Utilisateur pompiers : pompiers) {
            System.out.println(pompiers);
        }
    }
    
    public void modifierPompiers(Utilisateur pompiers, String nom, String prenom, String poste){
     pompiers.setNom(nom);
     pompiers.setPrenom(prenom);
     pompiers.setPoste(poste);         
    }
    
  
}

