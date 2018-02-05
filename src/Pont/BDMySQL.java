/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pont;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class BDMySQL extends BaseDeDonnee{

    @Override
    public void connexion() {
        System.out.println("Connexion MySQL Activer");  
    }

    @Override
    public void deconnexion() {
        System.out.println("Connexion MySQL Desactiver");  
    }
    
}
