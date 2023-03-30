/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeles;

/**
 *
 * @author noa.hervieu
 */
public class Volontaire extends Pompier{
    
    private boolean enActivite;
    private Profession profession;
    
    //Constructeur
    public Volontaire(){
        super();
    }

    public Volontaire(boolean enActivite, Profession profession) {
        super();
        this.enActivite = enActivite;
        this.profession = profession;
    }

    public boolean isEnActivite() {
        return enActivite;
    }

    public void setEnActivite(boolean enActivite) {
        this.enActivite = enActivite;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
    
    
   
    
    
}
