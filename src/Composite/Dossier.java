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
public class Dossier extends Noeud{
    
    private ArrayList<Noeud> mesNoeuds=new ArrayList<>();
    
    public Dossier(String nom){
        this.nom=nom;
    }    
    
    @Override
    public int taille() {
        int sommeTaille=0;
        for(Noeud n: mesNoeuds)
        {
            sommeTaille+=n.taille();
        }
        return sommeTaille;
    }
    
    public  void ajouter(Noeud n){
        mesNoeuds.add(n);
    }
    
    public  void supprimer(Noeud n){
        mesNoeuds.remove(n);
    }

    @Override
    public void afficherParExtension(String ext) {
        for(Noeud n: mesNoeuds)
        {
           n.afficherParExtension(ext);
        }
    }

    @Override
    public String toString() {
        return "Dossier "+nom;
    }
    
    
}
