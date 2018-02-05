/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterateur;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class IterrateurMenuTab implements IterateurMenu {

    private Plat plates[];
    private int index=0;

    public IterrateurMenuTab(Plat[] plates) {
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
      if(!this.estFini()){
            return plates[index++];
         }
         return null;
    }

    @Override
    public Plat current() {
        int i= index;
        i--;
        return this.plates[index-1];
    }
    
}
