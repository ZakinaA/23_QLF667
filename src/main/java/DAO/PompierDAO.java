/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeles.Professionnel;
import modeles.Volontaire;
import modeles.Pompier;
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
    
    public static boolean inscriptionProfessionnelBdd(Connection connection, String vNom, String vPrenom, String vDateNaissance, String vNumeroBip, String vIndiceTraitement, String vDateOptentionIndice){
      
        try 
        {
            requete = connection.prepareStatement("INSERT INTO `PROFESSIONNEL`(`PROF_INDICETRAITEMENT`, `PROF_DATEOBTENTIONINDICE`, `PROF_NOM`, `PROF_PRENOM`, `PROF_DATENAISSANCE`, `PROF_NUMEROBIP`) VALUES ('?','?','?','?','?','?') ");
            requete.setString(1, vIndiceTraitement);
            requete.setString(2, vDateOptentionIndice);
            requete.setString(3, vNom);
            requete.setString(4, vPrenom);
            requete.setString(5, vDateNaissance);
            requete.setString(6, vNumeroBip);
            
            requete.executeUpdate();
            
        }   
        catch (SQLException ex) {
            System.out.println("ERROR SQL");
        }
        
        
        return true;
    }
    
    public static boolean inscriptionVolontaireBdd(Connection connection, String vNom, String vPrenom, String vDateNaissance, String vNumeroBip, boolean vEnAtivite){
      
        try 
        {
            requete = connection.prepareStatement("INSERT INTO `VOLONTAIRE`(`VOL_ENACTIVITE`, `VOL_NOM`, `VOL_PRENOM`, `VOL_DATENAISSANCE`, `VOL_NUMEROBIP`) VALUES ('?','?','?','?','?','?')");
            requete.setBoolean(1, vEnAtivite);
            requete.setString(2, vNom);
            requete.setString(3, vPrenom);
            requete.setString(4, vDateNaissance);
            requete.setString(5, vNumeroBip);
            
            requete.executeUpdate();
            
        }   
        catch (SQLException ex) {
            System.out.println("ERROR SQL");
        }
        
        
        return true;
    }
    
    public static boolean inscriptionVolontaire2Bdd(Connection connection, String vNom, String vPrenom, String vDateNaissance, String vNumeroBip,  boolean vEnAtivite, String vNomPro, String vVille){
      
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
    }
}
