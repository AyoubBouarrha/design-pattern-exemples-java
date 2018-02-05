/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoidsMouche;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class OptionVehicule {
    private String nom;
    private String description;

    public OptionVehicule(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }
    
    public void affichage(float prix)
    {
        System.out.println(this.toString()+" prix: "+prix);
    }

    @Override
    public String toString() {
        return "OptionVehicule{" + "nom=" + nom + ", description=" + description + '}';
    }
    
    
    
}
