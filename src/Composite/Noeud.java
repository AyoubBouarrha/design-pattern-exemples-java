/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author Ayoub BOUARRHA
 */
public abstract class Noeud {
    protected String nom;  
    
    
    public void ajouter(Noeud n){}
    public void supprimer(Noeud n){}
    public abstract int taille();
    public abstract void afficherParExtension(String ext);
}
