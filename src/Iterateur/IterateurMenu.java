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
public interface IterateurMenu {
    public void inisialiser();
    public boolean estFini();
    public Plat suivant();
    public Plat current();
}
