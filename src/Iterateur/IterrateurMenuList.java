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
public class IterrateurMenuList implements IterateurMenu{

    private int index=0;
    List<Plat> plates;
    
    public IterrateurMenuList(List<Plat> plates) {
      this.plates = plates;
    }
    
    @Override
    public void inisialiser() {
        index=0;
    }

    @Override
    public boolean estFini() {
         if(index >= plates.size()){
            return true;
         }
         return false;
    }

    @Override
    public Plat suivant() {
        if(!this.estFini()){
            return plates.get(index++);
         }
         return null;
    }

    @Override
    public Plat current() {
        return this.plates.get(index);
    }
    
    
}
