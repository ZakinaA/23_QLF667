/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modeles.Pompier;
import modeles.Professionnel;
import modeles.Volontaire;

/**
 *
 * @author noa.hervieu
 */
public class connexionUserDao {
    
    static PreparedStatement requete = null;
    static private int nbCompteFound = 0;
    
    public static boolean connexionUser(Connection connection, String username, String password){
        try
        {
            
            requete = connection.prepareStatement("SELECT * FROM POMPIER WHERE POM_USERNAME = ? AND POM_MDP = ?");
            requete.setString(1, username);
            requete.setString(2, password);
            
            System.out.println(requete);
            
            ResultSet rs = requete.executeQuery();
            if (rs.next()){
                nbCompteFound = 1;
            }
            InitConnexion.fermerConnexion(rs);
            InitConnexion.fermerConnexion(requete);
            
            if (nbCompteFound == 0) { 
                return false;
            } else{
                return true;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public static Pompier connexionUserPom(Connection connection, String username, String password){
        String idCurrentPompier;
        try
        {
            
            requete = connection.prepareStatement("SELECT * FROM POMPIER WHERE POM_USERNAME = ? AND POM_MDP = ?");
            requete.setString(1, username);
            requete.setString(2, password);
            
            ResultSet rs = requete.executeQuery();
            if (rs.next()){
                nbCompteFound = 1;
                
                idCurrentPompier = rs.getString("POM_ID");
                String nom = rs.getString("POM_NOM");
                String prenom = rs.getString("POM_PRENOM");
                String naissance = rs.getString("POM_DATENAISSANCE");
                String numeroBip = rs.getString("POM_NUMEROBIP");

                // requete sur Professionnelle pom_id
                
                requete = connection.prepareStatement("SELECT * FROM PROFESSIONNEL WHERE PROF_ID = ?");
                requete.setString(1, idCurrentPompier);
                
                rs = requete.executeQuery(); //Execution de la reqete SQL
                // si profesionnel existe return profess
                if (rs.next()){
                    Professionnel currentPompier = new Professionnel();
                    
                    currentPompier.setId(Integer.parseInt(idCurrentPompier));
                    currentPompier.setInciceTraitement(rs.getString("PROF_INDICETRAITEMENT"));
                    currentPompier.setDateObtention(rs.getString("PROF_DATEOBTENTIONINDICE"));
                    currentPompier.setNom(nom);
                    currentPompier.setPrenom(prenom);
                    currentPompier.setDateNaissance(naissance);
                    currentPompier.setNumeroBip(numeroBip);
                    
                    return currentPompier;
                }else{
                    // requete sur Professionnelle pom_id
                
                    requete = connection.prepareStatement("SELECT * FROM VOLONTAIRE WHERE VOL_ID = ?");
                    requete.setString(1, idCurrentPompier);

                    rs = requete.executeQuery(); //Execution de la reqete SQL
                    // si profesionnel existe return profess
                    if (rs.next()){
                        Volontaire currentPompier = new Volontaire();

                        currentPompier.setId(Integer.parseInt(idCurrentPompier));
                        currentPompier.setEnActivite(Boolean.valueOf(rs.getString("VOL_ENACTIVITE")));
                        currentPompier.setNom(nom);
                        currentPompier.setPrenom(prenom);
                        currentPompier.setDateNaissance(naissance);
                        currentPompier.setNumeroBip(numeroBip);
                        
                        return currentPompier;
                    }else{
                        return null;
                    }
                }
                
                //sinon
                
                    //retruen volontaire
                
                
                
            }else{
                InitConnexion.fermerConnexion(rs);
                InitConnexion.fermerConnexion(requete);
                return null;
            }
            
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
}
