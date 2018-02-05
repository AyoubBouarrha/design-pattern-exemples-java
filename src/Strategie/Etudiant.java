/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategie;

/**
 *
 * @author Ayoub BOUARRHA
 */
public class Etudiant implements Comparable<Etudiant> {
    private String nom;
    private String prenom;
    private Float note;
    

    

    public Etudiant(String nom, String prenom, Float note) {
        this.nom = nom;
        this.prenom = prenom;
        this.note = note;
    }

    @Override
    public int compareTo(Etudiant o) {
       return nom.compareTo(o.nom);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Float getNote() {
        return note;
    }

    

    
    
    
    
    
    
}
