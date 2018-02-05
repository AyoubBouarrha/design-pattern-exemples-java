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
public abstract class Menu {
    public abstract IterateurMenu getIterateur();
    
    public void affichage()
    {
        IterateurMenu it= getIterateur();
        while(!it.estFini())
            if (it.suivant()!=null)
            it.current().Affichage();
    }
    
}
