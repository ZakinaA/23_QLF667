/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modeles.Professionnel;
import modeles.Volontaire;

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
             unProfessionnel.setNumeroBip(rs.getString("PROF_NUMEROBIP"));
             unProfessionnel.setDateNaissance(rs.getString("PROF_DATENAISSANCE"));

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
    
}
