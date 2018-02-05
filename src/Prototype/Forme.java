/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;



/**
 *
 * @author Ayoub BOUARRHA
 */
public abstract class Forme implements Cloneable{
    protected String couleur; 

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public Forme(String couleur) {
        this.couleur = couleur;
    }
    
    
    public  Forme clone ()
    {
        try 
        {
            return (Forme) super.clone();
        }
        catch (CloneNotSupportedException ex) {}
        return null;
    }
    

    public abstract void dessiner();
    public abstract void afficher();
    
   
    
}
