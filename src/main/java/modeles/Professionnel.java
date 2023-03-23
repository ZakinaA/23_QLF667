/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeles;

/**
 *
 * @author noa.hervieu
 */
public class Professionnel extends Pompier{
    
    private String inciceTraitement;
    private String dateObtention;

    //Constructeur
    public Professionnel() {
        super();
    }
    public Professionnel(String inciceTraitement, String dateObtention) {
        super();
        this.inciceTraitement = inciceTraitement;
        this.dateObtention = dateObtention;
    }

    //GETTER & SETTER
    public String getInciceTraitement() {
        return inciceTraitement;
    }

    public void setInciceTraitement(String inciceTraitement) {
        this.inciceTraitement = inciceTraitement;
    }

    public String getDateObtention() {
        return dateObtention;
    }

    public void setDateObtention(String dateObtention) {
        this.dateObtention = dateObtention;
    }
}
