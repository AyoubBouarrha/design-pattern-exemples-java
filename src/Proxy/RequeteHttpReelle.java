/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class RequeteHttpReelle implements RequeteHttp{
    
    
    public RequeteHttpReelle() {
        try 
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex){}
    }
        
    public void EnvoyerRequete(String req){       
        System.out.println("Requete Envoye :"+req);
    }


    
    
}
