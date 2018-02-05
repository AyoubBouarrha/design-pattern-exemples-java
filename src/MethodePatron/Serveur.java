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
public abstract class  Serveur {
    
    public abstract void demarrer();
    public abstract void arreter();
    
    public void redemarrer()
    {
        arreter(); 
        demarrer();              
    }
}
