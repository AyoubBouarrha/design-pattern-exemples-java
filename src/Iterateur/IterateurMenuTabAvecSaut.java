/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterateur;

import java.util.List;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class IterateurMenuTabAvecSaut implements IterateurMenu{

    private int index=0;
    private Plat plates[];
    
    public IterateurMenuTabAvecSaut(Plat[] plates) {
        this.plates = plates;
    }
    
    @Override
    public void inisialiser() {
        index=0;
    }

    @Override
    public boolean estFini() {
        if(index >= plates.length){
            return true;
         }
         return false;
    }

    @Override
    public Plat suivant() {
        while (!this.estFini()) {           
            
            if (!plates[index].isVegetarian()) {
                Plat p =plates[index]; 
                index++;
                return p;
            }
            index++;
        }
        return null;
    }
    @Override
    public Plat current() {
        return this.plates[index-1];
    }
}
