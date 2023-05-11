/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeles.Professionnel;
import modeles.Volontaire;
import modeles.Pompier;
import modeles.Situation;
/**
 *
 * @author noa.hervieu
 */
public class PompierDAO {
    
    Connection connection= null;
    static PreparedStatement requete=null;

    
    public static Professionnel getProfessionnelByMatricule(Connection connection, int matricule) {
        
        Professionnel unProfessionnel = new Professionnel();
     try
     {
         requete = connection.prepareStatement("SELECT * FROM PROFESSIONNEL WHERE PROF_ID=?");
         requete.setInt(1, matricule);
         
            ResultSet rs = requete.executeQuery();
         if (rs.next()){
            
             unProfessionnel.setInciceTraitement(rs.getString("PROF_INDICETRAITEMENT"));
             unProfessionnel.setDateObtention(rs.getString("PROF_DATEOBTENTIONINDICE"));
             unProfessionnel.setNom(rs.getString("PROF_NOM"));
             unProfessionnel.setPrenom(rs.getString("PROF_PRENOM"));

         }
         InitConnexion.fermerConnexion(rs);
         InitConnexion.fermerConnexion(requete);
     }
     catch (SQLException e)
     {
         e.printStackTrace();
     }
     return unProfessionnel;
        
    }
    
    public static Volontaire getVolontaireByMatricule(Connection connection, int matricule) {
        
        Volontaire unVolontaire = new Volontaire();
     try
     {
         requete = connection.prepareStatement("SELECT * FROM VOLONTAIRE WHERE VOL_ID =?");
         requete.setInt(1, matricule);
         
            ResultSet rs = requete.executeQuery();
         if (rs.next()){
            
             unVolontaire.setEnActivite(rs.getBoolean("VOL_ENACTIVITE"));

         }
         InitConnexion.fermerConnexion(rs);
         InitConnexion.fermerConnexion(requete);
     }
     catch (SQLException e)
     {
         e.printStackTrace();
     }
     return unVolontaire;
        
    }
    
    public static boolean inscriptionProfessionnelBdd(Connection connection, String vNom, String vPrenom, String vDateNaissance, String vNumeroBip, String vIndiceTraitement, String vDateOptentionIndice, String vUsername, String vMp){
      
        try 
        {
            requete = connection.prepareStatement("INSERT INTO `pompier`(`POM_ID_ASSIGNIE`, `POM_CODE`, `POM_CODE_OCCUPE`, `POM_ID_SOUSLARESPONSABILITE`, `POM_NOM`, `POM_PRENOM`, `POM_DATENAISSANCE`, `POM_NUMEROBIP`, `POM_USERNAME`, `POM_MDP`) VALUES (?,?,?,?,?,?,?,?,?,?)"); 
             requete.setString(1, "1");
            requete.setString(2, "SDP");
            requete.setString(3, "AE");
            requete.setString(4, "1");
            requete.setString(5, vNom);
            requete.setString(6, vPrenom);
            requete.setString(7, vDateNaissance);
            requete.setString(8, vNumeroBip);
            requete.setString(9, vUsername);
            requete.setString(10, vMp);
            requete.executeUpdate();
           
            requete = connection.prepareStatement("INSERT INTO `professionnel`(`PROF_INDICETRAITEMENT`, `PROF_DATEOBTENTIONINDICE`, `PROF_NOM`, `PROF_PRENOM`, `PROF_DATENAISSANCE`, `PROF_NUMEROBIP`) VALUES (?,?,?,?,?,?) ");
            requete.setString(1, vIndiceTraitement);
            requete.setString(2, vDateOptentionIndice);
            requete.setString(3, vNom);
            requete.setString(4, vPrenom);
            requete.setString(5, vDateNaissance);
            requete.setString(6, vNumeroBip);
            
            requete.executeUpdate();
            return true; 
        }   
        catch (SQLException ex) {
           ex.printStackTrace();
            return false;
        }
        
        
       
    }
    
    public static boolean inscriptionVolontaireBdd(Connection connection, String vNom, String vPrenom, String vDateNaissance, String vNumeroBip, boolean vEnAtivite, String vUsername, String vMp){
      
        try 
        {
            requete = connection.prepareStatement("INSERT INTO `pompier`(`POM_ID_ASSIGNIE`, `POM_CODE`, `POM_CODE_OCCUPE`, `POM_ID_SOUSLARESPONSABILITE`, `POM_NOM`, `POM_PRENOM`, `POM_DATENAISSANCE`, `POM_NUMEROBIP`, `POM_USERNAME`, `POM_MDP`) VALUES (?,?,?,?,?,?,?,?,?,?)"); 
            requete.setString(1, "1");
            requete.setString(2, "SDP");
            requete.setString(3, "AE"); 
            requete.setString(4, "1");
            requete.setString(5, vNom);
            requete.setString(6, vPrenom);
            requete.setString(7, vDateNaissance);
            requete.setString(8, vNumeroBip);
            requete.setString(9, vUsername);
            requete.setString(10, vMp);
            requete.executeUpdate();
            
            requete = connection.prepareStatement("INSERT INTO `volontaire`(`VOL_ENACTIVITE`, `VOL_NOM`, `VOL_PRENOM`, `VOL_DATENAISSANCE`, `VOL_NUMEROBIP`) VALUES (?,?,?,?,?)");
            requete.setBoolean(1, vEnAtivite);
            requete.setString(2, vNom);
            requete.setString(3, vPrenom);
            requete.setString(4, vDateNaissance);
            requete.setString(5, vNumeroBip);
            
            requete.executeUpdate();
            return true;
        }   
        catch (SQLException ex) {
             ex.printStackTrace();
            return false;
        }
        
        
       
    }
    
    public static ArrayList<Situation> getLesSituation(Connection connection){
        
        ArrayList<Situation> lesSituations = null;
      
        try 
        {
            requete = connection.prepareStatement("SELECT * FROM `situation`;"); 
            
            ResultSet rs = requete.executeQuery();
            while (rs.next()){
                
                Situation laSituation = new Situation();
            
                laSituation.setId(rs.getInt("SIT_ID"));
                laSituation.setLibelle(rs.getString("SIT_LIBELLE"));
                
                lesSituations.add(laSituation);

         }
         InitConnexion.fermerConnexion(rs);
         InitConnexion.fermerConnexion(requete);
            
            
        }   
        catch (SQLException ex) {
             ex.printStackTrace();
        }
        
        return lesSituations;
        
       
    }
    
    /*public static boolean inscriptionVolontaire2Bdd(Connection connection, String vNom, String vPrenom, String vDateNaissance, String vNumeroBip,  boolean vEnAtivite, String vNomPro, String vVille){
      
        try 
        {
            requete = connection.prepareStatement("INSERT INTO `VOLONTAIRE`(`VOL_ENACTIVITE`, `VOL_NOM`, `VOL_PRENOM`, `VOL_DATENAISSANCE`, `VOL_NUMEROBIP`) VALUES ('?','?','?','?','?','?')");
            requete.setBoolean(1, vEnAtivite);
            requete.setString(2, vNom);
            requete.setString(3, vPrenom);
            requete.setString(4, vDateNaissance);
            requete.setString(5, vNumeroBip);
            
            requete.executeUpdate();
            
            requete = connection.prepareStatement("INSERT INTO `PROFESSION`(`PRO_LIBELLE`, `PRO_VILLE`) VALUES ('?','?')");
            requete.setString(1, vNomPro);
            requete.setString(2, vVille);
        }   
        catch (SQLException ex) {
            System.out.println("ERROR SQL");
        }
        
        
        return true;
    }*/
}
