/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.InitConnexion;
import DAO.PompierDAO;
import java.sql.Connection;
import modeles.Professionnel;

/**
 *
 * @author noa.hervieu
 */
public class TestPompierDAO {
    public static void main(String[] args) {
        
        Connection connection = InitConnexion.ouvrirConnexion();
        
        Professionnel professionnelByMatricule = PompierDAO.getProfessionnelByMatricule(connection, 1);
        
        System.out.println("Nom : " + professionnelByMatricule.getNom());
        
        
    }
}
