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
public class MenuCafeteria extends Menu{
    private Plat plates[] = {new Plat("Salade", 30, true) ,
                            new Plat("Couscous", 50, false) ,
                            new Plat("Tagine Poulet", 60, true), 
                            new Plat("Crep", 20, false)};  
    

    @Override
    public IterateurMenu getIterateur() {
       return new IterateurMenuTabAvecSaut(plates);
    }

}
