/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodePatron;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class ServeurIIS extends Serveur{

    @Override
    public void demarrer() {
       System.out.println("Demarrage du Serveur IIS....");
            try 
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException ex) {}
        
            System.out.println("Serveur IIS est démarré");
    }

    @Override
    public void arreter() {
       System.out.println("Arret du Serveur IIS....");
            try 
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException ex) {}
        
            System.out.println("Arret IIS est démarré");
    }
    
}
