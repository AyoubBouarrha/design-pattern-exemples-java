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
public class ApplicationDesktop extends Application{

    public ApplicationDesktop() {
    }
    
     public ApplicationDesktop(BaseDeDonnee bd) {
         this.bd=bd;
    }


    @Override
    public void SeConnecter() {
        System.out.println("Tentative de connexion à partir d'une Application Desktop");
        this.bd.connexion();
    }

    @Override
    public void SeDecnnecter() {
        System.out.println("Tentative de deconnexion à partir d'une Application Desktop");
        this.bd.deconnexion();
    }
    
}
