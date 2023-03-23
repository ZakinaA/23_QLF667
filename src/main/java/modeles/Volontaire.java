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
    
    private Boolean enActivite;
    
    //Constructeur
    public Volontaire(){
        super();
    }
    
    public Volontaire(Boolean enActivite) {
        super();
        this.enActivite = enActivite;
    }
    
    //GETTER & SETTER
    public Boolean getEnActivite() {
        return enActivite;
    }

    public void setEnActivite(Boolean enActivite) {
        this.enActivite = enActivite;
    }
}
