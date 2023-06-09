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
public class Intervention {
    private int id;
    private String date;
    private String heureAppel;
    private String lieu;
    private String heureArrive;
    private String duree;
    private ArrayList listSituation;
    private Situation situation ;        
    private ArrayList listPompier ;
    
    public Intervention() {
    }

    public Intervention(int id, String date, String heureAppel, String lieu, String heureArrive, String duree) {
        this.id = id;
        this.date = date;
        this.heureAppel = heureAppel;
        this.lieu = lieu;
        this.heureArrive = heureArrive;
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeureAppel() {
        return heureAppel;
    }

    public void setHeureAppel(String heureAppel) {
        this.heureAppel = heureAppel;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getHeureArrive() {
        return heureArrive;
    }

    public void setHeureArrive(String heureArrive) {
        this.heureArrive = heureArrive;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public ArrayList getListSituation() {
        return listSituation;
    }

    public void setListSituation(ArrayList listSituation) {
        this.listSituation = listSituation;
    }

    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }

    public ArrayList getListPompier() {
        return listPompier;
    }

    public void setListPompier(ArrayList listPompier) {
        this.listPompier = listPompier;
    }
    
    public void addUneSituation(Situation pUneSituation){
        if (listSituation==null){
            listSituation=new ArrayList<Situation>(); 
        }
        listSituation.add(pUneSituation);
    }
    
     public void addUnPompier(Pompier pUnPompier){
        if (listPompier==null){
            listPompier=new ArrayList<Pompier>(); 
        }
        listPompier.add(pUnPompier);
    }
}
