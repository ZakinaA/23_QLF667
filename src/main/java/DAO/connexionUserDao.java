/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
}
