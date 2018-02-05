/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Fichier  extends Noeud{
    private int taille;

    @Override
    public int taille() {
        return this.taille;
    }

    public Fichier(String nom, int taille) {
        this.nom = nom;
        this.taille=taille;
    }

    @Override
    public void afficherParExtension(String ext) {
        if(this.nom.endsWith(ext))//if(this.nom.substring(this.nom.length()-ext.length()).equals(ext))
             System.out.println("- Nom: "+this.nom+" -Taille:"+this.taille);
    }
    
    

    
}
