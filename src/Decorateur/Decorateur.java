/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorateur;

/**
 *
 * @author Ayoub BOUARRHA
 */
public abstract class Decorateur  extends ComposantVisuel{
    
    ComposantVisuel composant;
    @Override
    public void dessiner() {    
        composant.dessiner();
    }

    public Decorateur(ComposantVisuel composant) {
        this.composant = composant;
    }   
}
