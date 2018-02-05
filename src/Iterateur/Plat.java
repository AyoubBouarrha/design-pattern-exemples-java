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
public class Plat {
    private String nom;
    private float prix;
    private boolean vegetarian;

    public Plat(String nom, float prix, boolean vegetarian) {
        this.nom = nom;
        this.prix = prix;
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "Plat{" + "nom=" + nom + ", prix=" + prix + ", vegetarian=" + vegetarian + '}';
    }
    
    public void Affichage(){
        System.out.println(this.toString());
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
    
    
    
    
}
